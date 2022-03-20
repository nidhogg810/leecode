package thread.demo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThreadDemoTest {
    ThreadDemo thread;
    @Before
    public void setUp() throws Exception {
        thread = new ThreadDemo();
        thread.init();
    }
    @Test
    public void allStartMeanwhile_cyclicBarrier(){
        thread.allStartMeanwhile();
    }
    @Test
    public void allStartMeanwhile_CountDownLatch(){
        thread.allStartMeanwhile_CountDownLatch();
    }
    @Test
    public void allStartOrder(){
        try {
            thread.allStartOrder();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}