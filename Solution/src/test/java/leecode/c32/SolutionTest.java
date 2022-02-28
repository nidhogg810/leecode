package leecode.c32;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    Solution solution;
    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void nextPermutation0() {
        Assert.assertEquals(2,solution.longestValidParentheses("(()"));
    }
    @Test
    public void nextPermutation1() {
        Assert.assertEquals(4,solution.longestValidParentheses(")()())"));
    }
    @Test
    public void nextPermutation2() {
        Assert.assertEquals(0,solution.longestValidParentheses(""));
    }
    @Test
    public void nextPermutation3() {
        Assert.assertEquals(2,solution.longestValidParentheses("()(()"));
    }

    @Test
    public void nextPermutation4() {
        Assert.assertEquals(2,solution.longestValidParentheses("()))()"));
    }
}