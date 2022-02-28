package leecode.c33;

public class Solution {
    public int search(int[] nums, int target) {
        int startIndex = getIndex(nums);
        int n = nums.length;
        if(n==1){
            if(target == nums[0]) {
                return 0;
            }else{
                return -1;
            }
        }else if(n==0){
            return -1;
        }
        int minInt = nums[startIndex];
        int maxInt = nums[startIndex-1<0? n-1: startIndex-1];
        if(minInt<target&&target>maxInt){
            return -1;
        }
        int pos = 0;
        int left = pos,right = n-1;
        while (left<=right){
            int leftIndex = pos(startIndex+left,n);
            int leftValue = nums[leftIndex];
            int rightIndex = pos(startIndex+right,n);
            int rightValue = nums[rightIndex];
            int midIndex = pos(startIndex+(left+right)/2,n);
            int midValue = nums[midIndex];
            if(target == leftValue){
                return startIndex+left;
            }
            if(target == rightValue){
                return startIndex+rightValue;
            }
            if(target == midValue){
                return startIndex+(left+right)/2;
            }else if(target<midValue){
                right = midIndex;
            }else if(target>midValue){
                left = midIndex;
            }
        }
        return -1;
    }
    private int pos(int x,int n){
        return x>=n? x-n:x;
    }
    private int getIndex(int[] nums){
        for(int i=1;i<nums.length;++i){
            if(nums[i-1]>nums[i]){
                return i;
            }
        }
        return 0;
    }
}
