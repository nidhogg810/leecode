package leecode.c16;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution ;
    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void threeSumClosest0() {
        int[] nums = new int[]{-1,2,1,-4};
        assertEquals(2,solution.threeSumClosest(nums,1));
    }
    @Test
    public void threeSumClosest1() {
        int[] nums = new int[]{0,0,0};
        assertEquals(0,solution.threeSumClosest(nums,1));
    }
}