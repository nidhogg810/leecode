package leecode.c28.kmp;

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
    public void preCalNext() {
        System.out.println(Arrays.toString(solution.preCalNext("aaabbab")));
        System.out.println(Arrays.toString(solution.pre("aaabbab")));
    }

    @Test
    public void strStr() {
        assertEquals(2,solution.strStr("hello","ll"));
    }
}