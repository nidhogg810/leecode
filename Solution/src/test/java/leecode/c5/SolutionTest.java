package leecode.c5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution ;
    @Before
    public void setUp(){
        solution = new Solution();
    }

    @Test
    public void longestPalindrome1() {
        assertEquals("bab",solution.longestPalindrome("babad"));
    }

    @Test
    public void longestPalindrome2() {
        assertEquals("bb",solution.longestPalindrome("cbbd"));
    }

    @Test
    public void longestPalindrome3() {
        assertEquals("a",solution.longestPalindrome("a"));
    }

    @Test
    public void longestPalindrome4() {
        assertEquals("a",solution.longestPalindrome("ac"));
    }
}