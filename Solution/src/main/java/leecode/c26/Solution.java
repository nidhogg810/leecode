package leecode.c26;

import java.util.Objects;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if(Objects.isNull(nums)||nums.length==0){
            return 0;
        }
        int fast=1,slow =1;
        while (fast<nums.length){
            if(nums[fast]!=nums[fast-1]){
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }

        return slow;
    }
}
