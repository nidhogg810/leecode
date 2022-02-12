package leecode.c1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {

    Solution solution;
    @Before
    public void setup(){
        solution = new Solution();
    }
    @Test
    public void test_twoSum1(){
        int[] expect = {0,1};
        int[] actual = solution.twoSum(new int[]{2,7,11,15},9);
        assertArrayEquals(expect,actual);

    }
    @Test
    public void test_twoSum2(){
        int[] expect = new int[]{1, 2};
        int[] actual = solution.twoSum(new int[]{3, 2, 4}, 6);
        assertArrayEquals(actual,expect);

    }
    @Test
    public void test_twoSum3(){
        int[] expect = new int[]{0, 1};
        int[] actual = solution.twoSum(new int[]{3, 3}, 6);
        assertArrayEquals(actual,expect);

    }
    @Test
    public void test_twoSum1_hash(){
        int[] expect = {0,1};
        int[] actual = solution.twoSum_hashtable(new int[]{2,7,11,15},9);
        assertArrayEquals(expect,actual);

    }
    @Test
    public void test_twoSum2_hash(){
        int[] expect = new int[]{1, 2};
        int[] actual = solution.twoSum_hashtable(new int[]{3, 2, 4}, 6);
        assertArrayEquals(actual,expect);

    }
    @Test
    public void test_twoSum3_hash(){
        int[] expect = new int[]{0, 1};
        int[] actual = solution.twoSum_hashtable(new int[]{3, 3}, 6);
        assertArrayEquals(actual,expect);

    }
    private void assertArrayEquals(int[] expect,int[] actual){
        Arrays.sort(expect);
        Arrays.sort(actual);
        Assert.assertArrayEquals(expect, actual);
    }
}