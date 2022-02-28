package leecode.c18;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void fourSum0() {
        int[] nums = new int[] {1,0,-1,0,-2,2};
        List<List<Integer>> expt = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(-2);
        arr1.add(-1);
        arr1.add(1);
        arr1.add(2);
        expt.add(arr1);
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(-2);
        arr2.add(0);
        arr2.add(0);
        arr2.add(2);
        expt.add(arr2);
        List<Integer> arr3 = new ArrayList<>();
        arr3.add(-1);
        arr3.add(0);
        arr3.add(0);
        arr3.add(1);
        expt.add(arr3);
        assertEquals(expt,solution.fourSum(nums,0));
    }

    @Test
    public void fourSum1() {
        int[] nums = new int[] {0,0,0,0};
        List<List<Integer>> expt = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(0);
        arr1.add(0);
        arr1.add(0);
        arr1.add(0);
        expt.add(arr1);

        assertEquals(expt,solution.fourSum(nums,0));
    }
}