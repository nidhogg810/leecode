package leecode.c20;

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
    public void isValid0() {
        assertTrue(solution.isValid("()"));
    }
    @Test
    public void isValid1() {
        assertTrue(solution.isValid("()[]{}"));
    }
    @Test
    public void isValid2() {
        assertFalse(solution.isValid("(]"));
    }
    @Test
    public void isValid3() {
        assertFalse(solution.isValid("([)]"));
    }
    @Test
    public void isValid4() {
        assertTrue(solution.isValid("{[]}"));
    }
}