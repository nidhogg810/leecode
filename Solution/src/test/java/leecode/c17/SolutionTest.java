package leecode.c17;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
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
    public void letterCombinations0() {
        String digs = "23";
        List<String> expect = Arrays.asList(new String[]{"ad","ae","af","bd","be","bf","cd","ce","cf"});
        assertEquals(expect,solution.letterCombinations(digs));
    }
    @Test
    public void letterCombinations1() {
        String digs = "";
        assertEquals(new ArrayList<>(),solution.letterCombinations(digs));
    }

    @Test
    public void letterCombinations2() {
        String digs = "2";
        List<String> expect = Arrays.asList(new String[]{"a","b","c"});
        assertEquals(expect,solution.letterCombinations(digs));
    }
}