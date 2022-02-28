package leecode.c33;

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
    public void search0() {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        assertEquals(4,solution.search(nums,0));
    }
    @Test
    public void search1() {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        assertEquals(-1,solution.search(nums,3));
    }
    @Test
    public void search2() {
        int[] nums = new int[]{1};
        assertEquals(-1,solution.search(nums,0));
    }

    @Test
    public void search3() {
        int[] nums = new int[]{0,1,2,4,5,6,7};
        assertEquals(0,solution.search(nums,0));
    }

}