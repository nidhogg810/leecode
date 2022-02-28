package leecode.c23;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution;
    @Before
    public void setUp(){
        solution = new Solution();
    }

    @Test
    public void mergeKLists0() {
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1,new ListNode(4,new ListNode(5)));
        lists[1] = new ListNode(1,new ListNode(3,new ListNode(4)));
        lists[2] = new ListNode(2,new ListNode(6));
        System.out.println(solution.mergeKLists(lists));
    }

    @Test
    public void mergeKLists1() {
        ListNode[] lists = new ListNode[0];
        System.out.println(solution.mergeKLists(lists));
    }

    @Test
    public void mergeKLists2() {
        ListNode[] lists = new ListNode[11];
        System.out.println(solution.mergeKLists(lists));
    }
}