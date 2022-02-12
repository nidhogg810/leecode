package leecode.c12;

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
    public void intToRoman0() {
        assertEquals("III",solution.intToRoman(3));
    }

    @Test
    public void intToRoman1() {
        assertEquals("IV",solution.intToRoman(4));
    }
    @Test
    public void intToRoman2() {
        assertEquals("IX",solution.intToRoman(9));
    }
    @Test
    public void intToRoman3() {
        assertEquals("LVIII",solution.intToRoman(58));
    }
    @Test
    public void intToRoman4() {
        assertEquals("MCMXCIV",solution.intToRoman(1994));
    }
}