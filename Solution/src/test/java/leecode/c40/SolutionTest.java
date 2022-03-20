package leecode.c40;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution;
    @Before
    public void setUp(){
        solution = new Solution();
    }
    @Test
    public void combinationSum2() {
        System.out.println(solution.combinationSum2(new int[]{10,1,2,7,6,1,5},8));
    }
}