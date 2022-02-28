package leecode.c21;

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
    public void mergeTwoLists0() {
        ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode l2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode merge = solution.mergeTwoLists(l1,l2);
        System.out.println(merge);
    }
    @Test
    public void mergeTwoLists1() {
        ListNode l1 = null;
        ListNode l2 = null;
        ListNode merge = solution.mergeTwoLists(l1,l2);
        System.out.println(merge);
    }
    @Test
    public void mergeTwoLists2() {
        ListNode l1 = null;
        ListNode l2 = new ListNode(0);
        ListNode merge = solution.mergeTwoLists(l1,l2);
        System.out.println(merge);
    }
}