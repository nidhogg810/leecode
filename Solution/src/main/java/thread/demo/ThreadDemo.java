package thread.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.concurrent.*;

/**
 * 完成3个功能
 * a、3个线程同时进行
 * b、3个线程一个一个顺序进行
 * c、3个线程交替执行
 * 注重 CountDownLatch,CyclicBarrier,Semaphere的用法
 */
public class ThreadDemo {
    private static final Logger log = LoggerFactory.getLogger(ThreadDemo.class);
    private static ExecutorService pool;

    @PostConstruct
    public void init() {
        log.info("create pool");
        pool = Executors.newFixedThreadPool(3);

    }
    @PreDestroy
    public void shutDown(){
        log.info("shutdown pool");
        if(!pool.isShutdown()){
            pool.shutdown();
        }
    }
    /**
     * 3个线程同时出发
     * 使用栅栏实现
     */
    public void allStartMeanwhile() {
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
        pool.submit(() -> {
            try {
                cyclicBarrier.await();
                doSomething("a thread do");
            } catch (InterruptedException | BrokenBarrierException e) {
                log.error("thread-a error!", e);
            }
        });
        pool.submit(() -> {
            try {
                cyclicBarrier.await();
                doSomething("b thread do");
            } catch (InterruptedException | BrokenBarrierException e) {
                log.error("thread-b error!", e);
            }
        });
        pool.submit(() -> {
            try {
                cyclicBarrier.await();
                doSomething("c thread do");
            } catch (InterruptedException | BrokenBarrierException e) {
                log.error("thread-c error!", e);
            }
        });
    }

    /**
     * 使用这个计数器来实现
     */
    public void allStartMeanwhile_CountDownLatch(){
        CountDownLatch countDownLatch = new CountDownLatch(3);
        pool.submit(() -> {
            countDownLatch.countDown();
            try {
                countDownLatch.await();
                doSomething("a thread do");
            } catch (InterruptedException e) {
                log.error("thread-a error!", e);
            }
        });
        pool.submit(() -> {
            countDownLatch.countDown();
            try {
                countDownLatch.await();
                doSomething("b thread do");
            } catch (InterruptedException e) {
                log.error("thread-b error!", e);
            }
        });
        pool.submit(() -> {
            countDownLatch.countDown();
            try {
                countDownLatch.await();
                doSomething("c thread do");
            } catch (InterruptedException e) {
                log.error("thread-c error!", e);
            }
        });
    }

    /**
     * 指定一个顺序运行3个线程
     */
    public void allStartOrder() throws InterruptedException {
        //信号量
        Semaphore semaphoreA = new Semaphore(1);
        Semaphore semaphoreB = new Semaphore(1);
        Semaphore semaphoreC = new Semaphore(1);

        try {
            semaphoreA.acquire();
            semaphoreB.acquire();
            semaphoreC.acquire();
        } catch (InterruptedException e) {
            log.error("acquire error!",e);
        }

        pool.submit(()->{
            try {
                semaphoreA.acquire(1);
                doSomething("a thread do");
            } catch (InterruptedException e) {
                log.error("thread-a error!",e);
            } finally {
                semaphoreA.release(1);
            }
        });
        pool.submit(()->{
            try {
                semaphoreB.acquire(1);
                doSomething("b thread do");
            } catch (InterruptedException e) {
                log.error("thread-b error!",e);
            } finally {
                semaphoreB.release(1);
            }
        });
        pool.submit(()->{
            try {
                semaphoreC.acquire(1);
                doSomething("c thread do");
            } catch (InterruptedException e) {
                log.error("thread-c error!",e);
            } finally {
                semaphoreC.release(1);
            }
        });
        //Order
        semaphoreA.release();
        Thread.sleep(10);
        semaphoreC.release();
        Thread.sleep(10);
        semaphoreB.release();
        Thread.sleep(10);

    }
    private void doSomething(String s) {
        log.info(s);
    }
}
