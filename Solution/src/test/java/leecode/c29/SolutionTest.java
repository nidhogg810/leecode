package leecode.c29;

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
    public void divide() {
        System.out.println(solution.divide(2147483647,
                3));
    }

    @Test
    public void getRange2porN() {
        int dividend = -10;
        int divisor = -3;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE&1);
        System.out.println(1>>1);
    }
}