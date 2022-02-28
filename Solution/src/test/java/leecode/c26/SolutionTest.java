package leecode.c26;

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
    public void removeDuplicates() {
        int[] nums = new int[]{};
        assertEquals(0,solution.removeDuplicates(nums));
    }
}