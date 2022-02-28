package leecode.c19;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void removeNthFromEnd0() {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode result = solution.removeNthFromEnd(head,2);
        System.out.println(result);
        assertEquals(1,result.val);
    }

    @Test
    public void removeNthFromEnd3() {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode result = solution.removeNthFromEnd(head,5);
        System.out.println(result);
        assertEquals(2,result.val);
    }

    @Test
    public void removeNthFromEnd1() {
        ListNode head = new ListNode(1);
        ListNode result = solution.removeNthFromEnd(head,1);
        System.out.println(result);
        assertEquals(0,result.val);
    }

    @Test
    public void removeNthFromEnd2() {
        ListNode head = new ListNode(1,new ListNode(2));
        ListNode result = solution.removeNthFromEnd(head,1);
        System.out.println(result);
        assertEquals(1,result.val);
    }
}