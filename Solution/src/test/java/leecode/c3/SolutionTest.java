package leecode.c3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    Solution solution;
    @Before
    public void setUp(){
        solution = new Solution();
    }

    @Test
    public void lengthOfLongestSubString() {
        Assert.assertEquals(1,solution.lengthOfLongestSubstring("bbbbb"));
        Assert.assertEquals(3,solution.lengthOfLongestSubstring("abcabcabc"));
        Assert.assertEquals(3,solution.lengthOfLongestSubstring("pwwkew"));
        Assert.assertEquals(2,solution.lengthOfLongestSubstring("au"));
        Assert.assertEquals(2,solution.lengthOfLongestSubstring("aab"));
    }
}