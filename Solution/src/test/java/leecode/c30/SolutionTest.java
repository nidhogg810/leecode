package leecode.c30;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution;
    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void findSubstring0() {
        String[] t1 = new String[]{"foo","bar"};
        Assert.assertEquals(List.of(new Integer[]{0,9}),solution.findSubstring("barfoothefoobarman",t1));
    }

    @Test
    public void findSubstring1() {
        String[] t1 = new String[]{"bar","foo","the"};
        Assert.assertEquals(List.of(new Integer[]{6, 9, 12}),solution.findSubstring("barfoofoobarthefoobarman",t1));
    }

    @Test
    public void findSubstring2() {
        String[] t2 = new String[]{"word","good","best","word"};
        Assert.assertEquals(List.of(new Integer[]{}),solution.findSubstring("wordgoodgoodgoodbestword",t2));
    }
}