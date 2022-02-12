package leecode.c10;

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
    public void isMatch0() {
        String s = "aa";
        String p = "a";
        assertFalse(solution.isMatch(s, p));
    }
    @Test
    public void isMatch1() {
        String s = "aa";
        String p = "a*";
        assertTrue(solution.isMatch(s,p));
    }
    @Test
    public void isMatch2() {
        String s = "ab";
        String p = ".*";
        assertTrue(solution.isMatch(s,p));
    }
    @Test
    public void isMatch3() {
        String s = "aab";
        String p = "c*a*b";
        assertTrue(solution.isMatch(s,p));
    }

    @Test
    public void isMatch4() {
        String s = "mississippi";
        String p = "mis*is*p*.";
        assertFalse(solution.isMatch(s, p));
    }
}