package leecode.c34;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回[-1, -1]。
 *
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int leftans = binarySearch(nums,target,true);
        int rightans = binarySearch(nums,target,false)-1;
        if (leftans <= rightans && rightans < nums.length && nums[leftans] == target && nums[rightans] == target) {
            return new int[]{leftans, rightans};
        }

        return new int[]{-1,-1};
    }

    public int binarySearch(int[] nums,int target,boolean allow){
        int left=0,right = nums.length-1,ans=0;
        while (left<=right){
            int mid = (left+right)/2;

            if(nums[mid]>target||(allow&&nums[mid]>=target)){
                //不断更新ans
                //直到最后不成立
                right = mid-1;
                ans = mid;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
}
