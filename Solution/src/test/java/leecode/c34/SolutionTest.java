package leecode.c34;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void searchRange0() {
        System.out.println(Arrays.toString(solution.searchRange(new int[]{5, 7, 7, 7,7,7,8,8, 8, 10}, 8)));
    }

}