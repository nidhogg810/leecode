package leecode.c9;

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
    public void isPalindrome0() {
        assertTrue(solution.isPalindrome(121));
    }
    @Test
    public void isPalindrome1() {
        assertFalse(solution.isPalindrome(-121));
    }
    @Test
    public void isPalindrome2() {
        assertFalse(solution.isPalindrome(10));
    }
    @Test
    public void isPalindrome3() {
        assertFalse(solution.isPalindrome(-101));
    }
}