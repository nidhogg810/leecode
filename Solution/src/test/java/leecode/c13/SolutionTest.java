package leecode.c13;

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
    public void romanToInt0() {
        assertEquals(3,solution.romanToInt("III"));
    }
    @Test
    public void romanToInt1() {
        assertEquals(4,solution.romanToInt("IV"));
    }
    @Test
    public void romanToInt2() {
        assertEquals(9,solution.romanToInt("IX"));
    }
    @Test
    public void romanToInt3() {
        assertEquals(58,solution.romanToInt("LVIII"));
    }
    @Test
    public void romanToInt4() {
        assertEquals(1994,solution.romanToInt("MCMXCIV"));
    }
}