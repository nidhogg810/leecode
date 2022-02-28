package leecode.c16;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minLength = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int minNumsSum = nums[0]+nums[1]+nums[2];
        int maxNumsSum = nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3];
        int result=0;
        if(minNumsSum>=target){
            return minNumsSum;
        }
        if(maxNumsSum<=target){
            return maxNumsSum;
        }
        int first=0,second=1,third = nums.length-1;
        while (first<nums.length-2&&first<second){
            second = first+1;
            while (second<nums.length-1){
                int sum = nums[first]+nums[second]+nums[third];
                while (third>1&&second<third){
                    if(checkSum(target,sum,minLength)){
                        //满足结果条件
                        result = sum;
                    }
                    --third;
                }
                if(second==third){
                    //遍历完了
                    break;
                }

                second++;
            }
        }
        return result;
    }

    private boolean checkSum(int target,int sum, int minLength){
        int sub = target - sum;
        if(Math.abs(sub)>=Math.abs(minLength)){
            return false;
        }else{
            return true;
        }
    }
}
