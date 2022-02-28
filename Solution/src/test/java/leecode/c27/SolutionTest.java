package leecode.c27;

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
    public void removeElement0() {
        int[] nums = new int[]{3,2,2,3};
        assertEquals(2,solution.removeElement(nums,3));
    }

    @Test
    public void removeElement1() {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        assertEquals(5,solution.removeElement(nums,2));
    }
}