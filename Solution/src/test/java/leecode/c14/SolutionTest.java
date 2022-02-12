package leecode.c14;

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
    public void longestCommonPrefix0() {
        String[] str = new String[]{"flower","flow","flight"};
        assertEquals("fl",solution.longestCommonPrefix(str));
    }
    @Test
    public void longestCommonPrefix1() {
        String[] str = new String[]{"dog","racecar","car"};
        assertEquals("",solution.longestCommonPrefix(str));
    }

}