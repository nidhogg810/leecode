package leecode.c22;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution;
    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void generateParenthesis0() {
        List<String> act = solution.generateParenthesis(4);

        String[] exp = new String[]{"(((())))","((()()))","((())())","((()))()","(()(()))","(()()())","(()())()","(())(())","(())()()","()((()))","()(()())","()(())()","()()(())","()()()()"};
        Arrays.sort(exp);
        assertEquals(Arrays.asList(exp),act);
    }

    @Test
    public void generateParenthesis1() {
        String[] act = new String[]{"()()()()","(()())()","(()(()))","()()(())","(())()()","(((())))","()((()))","()(())()","()(()())","(()()())","((()()))","((()))()","((())())"};
        String[] exp = new String[]{"(((())))","((()()))","((())())","((()))()","(()(()))","(()()())","(()())()","(())(())","(())()()","()((()))","()(()())","()(())()","()()(())","()()()()"};
        Arrays.sort(act);
        System.out.println(Arrays.toString(act));
        Arrays.sort(exp);
        System.out.println(Arrays.toString(exp));
        assertArrayEquals(exp,act);
    }

}