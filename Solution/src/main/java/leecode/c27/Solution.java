package leecode.c27;

import java.util.Arrays;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int fastIndex = 0;
        int slowIndex = 0;
        while (fastIndex<nums.length){
            if(nums[fastIndex]!= val){
                nums[slowIndex] = nums[fastIndex];
                ++slowIndex;
            }
            ++fastIndex;
        }
        return slowIndex;
    }
}
