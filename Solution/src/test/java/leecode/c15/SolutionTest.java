package leecode.c15;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution ;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void threeSum0() {
        int[] nums = new int[] {-1,0,1,2,-1,-4};
        List<List<Integer>> act = solution.threeSum(nums);
        List<List<Integer>> exp = new ArrayList<>();
        ArrayList<Integer> t1 = new ArrayList<>(3);
        t1.add(-1);
        t1.add(-1);
        t1.add(2);
        exp.add(t1);
        ArrayList<Integer> t2 = new ArrayList<>(3);
        t2.add(-1);
        t2.add(0);
        t2.add(1);
        exp.add(t2);
        assertEquals(exp,act);
    }
    @Test
    public void threeSum1() {
        int[] nums = new int[] {};
        List<List<Integer>> act = solution.threeSum(nums);
        List<List<Integer>> exp = new ArrayList<>();
        assertEquals(exp,act);
    }
    @Test
    public void threeSum2() {
        int[] nums = new int[] {0,0,0};
        List<List<Integer>> act = solution.threeSum(nums);
        List<List<Integer>> exp = new ArrayList<>();
        ArrayList<Integer> t1 = new ArrayList<>(3);
        t1.add(0);
        t1.add(0);
        t1.add(0);
        exp.add(t1);
        assertEquals(exp,act);
    }
    @Test
    public void threeSum3() {
        int[] nums = new int[] {0};
        List<List<Integer>> act = solution.threeSum(nums);
        List<List<Integer>> exp = new ArrayList<>();
        assertEquals(exp,act);
    }
}