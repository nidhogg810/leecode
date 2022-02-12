package leecode.c2;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    Solution solution;
    @Before
    public void setup(){
        solution = new Solution();
    }

    @Test
    public void test_twoSum(){
        int[] l1 = new int[]{2,4,3};
        int[] l2 = new int[]{5,6,4};
        int[] result = new int[]{7,0,8};
        Assert.assertEquals(ListNode.instance(result),solution.addTwoNumbers(ListNode.instance(l1),ListNode.instance(l2)));
        l1 = new int[]{0};
        l2 = new int[]{0};
        result = new int[]{0};
        Assert.assertEquals(ListNode.instance(result),solution.addTwoNumbers(ListNode.instance(l1),ListNode.instance(l2)));
        l1 = new int[]{9,9,9,9,9,9,9};
        l2 = new int[]{9,9,9,9};
        result = new int[]{8,9,9,9,0,0,0,1};
        Assert.assertEquals(ListNode.instance(result),solution.addTwoNumbers(ListNode.instance(l1),ListNode.instance(l2)));

        l1 = new int[]{2,4,3};
        l2 = new int[]{5,6,4};
        result = new int[]{7,0,8};
        Assert.assertEquals(ListNode.instance(result),solution.addTwoNumbers(ListNode.instance(l1),ListNode.instance(l2)));
    }
}