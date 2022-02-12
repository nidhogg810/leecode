package leecode.c7;

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
    public void reverse() {
        assertEquals(321, solution.reverse(123));
    }

    @Test
    public void reverse2() {
        assertEquals(-321, solution.reverse(-123));
    }

    @Test
    public void reverse3() {
        assertEquals(0, solution.reverse(1534236469));
    }
}