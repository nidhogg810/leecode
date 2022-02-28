package leecode.c50;

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
    public void myPow0() {
        System.out.println(solution.myPow(2.00000,
                        -2147483648));
    }
}