package leecode.c4;

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
    public void findMedianSortedArrays1() {
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};
        assertEquals(2,solution.findMedianSortedArrays(nums1,nums2),0d);
    }
    @Test
    public void findMedianSortedArrays2() {
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};
        assertEquals(2.5d,solution.findMedianSortedArrays(nums1,nums2),0d);
    }

    @Test
    public void findMedianSortedArrays3() {
        int[] nums1 = new int[]{0,0};
        int[] nums2 = new int[]{0,0};
        assertEquals(0d,solution.findMedianSortedArrays(nums1,nums2),0d);
    }

    @Test
    public void findMedianSortedArrays4() {
        int[] nums1 = new int[]{2};
        int[] nums2 = new int[]{};
        assertEquals(2d,solution.findMedianSortedArrays(nums1,nums2),0d);
    }
}