package leecode.c8;

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
    public void myAtoi0() {
        assertEquals(42,solution.myAtoi("42"));
    }
    @Test
    public void myAtoi1() {
        assertEquals(-42,solution.myAtoi("   -42"));
    }
    @Test
    public void myAtoi2() {
        assertEquals(4193,solution.myAtoi("4193 with words"));
    }
    @Test
    public void myAtoi3() {
        assertEquals(0,solution.myAtoi("words and 987"));
    }
    @Test
    public void myAtoi4() {
        assertEquals(-2147483648,solution.myAtoi("-91283472332"));
    }

}