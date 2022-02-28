package leecode.c25;

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
    public void reverseKGroup() {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
        System.out.println(solution.reverseKGroup(head,2));
    }
}