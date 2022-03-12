package leecode.c39;

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
    public void combinationSum() {
        System.out.println(solution.combinationSum(new int[]{2,3,6,7},7));
    }
}