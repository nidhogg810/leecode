package leecode.c41;

/**
 * 原地哈希表
 */
public class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for(int i=0;i<len;++i){
            while (nums[i]>0&&nums[i]<=len&&i!=hash(nums[i])&&nums[hash(nums[i])] != nums[i]){
                swap(nums,i,hash(nums[i]));
            }
        }
        int ans = len+1;
        for(int k=0;k<len;++k){
            int hash = hash(nums[k]);
            if(hash!=k){
                ans = k+1;
            }
        }
         return ans;
    }
    public void swap(int[] nums,int index1,int index2){
        int tmp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = tmp;
    }

    /**
     * 根据value，计算出应该放到哪个下标下面
     * @param value
     * @return
     */
    public int hash(int value){
        return value-1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstMissingPositive(new int[]{3,4,-1,1}));
    }
}
