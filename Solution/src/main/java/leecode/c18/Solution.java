package leecode.c18;

import java.util.*;

public class Solution {
    /**
     * 给你一个由 n 个整数组成的数组nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组[nums[a], nums[b], nums[c], nums[d]]（若两个四元组元素一一对应，则认为两个四元组重复）：
     *
     * 0 <= a, b, c, d< n
     * a、b、c 和 d 互不相同
     * nums[a] + nums[b] + nums[c] + nums[d] == target
     * 你可以按 任意顺序 返回答案
     *
     */
    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> quadruplets = new ArrayList<List<Integer>>();
//        Set<Integer> numsSet = new LinkedHashSet<>();
        if (nums == null || nums.length < 4) {
            return quadruplets;
        }
        int length = nums.length;
        //先排序
        Arrays.sort(nums);
        //去重
//        for(int i=0;i<length;++i){
//            numsSet.add(nums[i]);
//        }
//        Integer[] arr = new Integer[numsSet.size()];
//        arr = numsSet.toArray(arr);
//        int setLength = arr.length;
        int first,second,third,forth;
        for(first=0;first<length-3;++first){
            //去掉重复的
            if(first>0&&nums[first]==nums[first-1]){
                continue;
            }
            for(second=first+1;second<length-2;++second){
                if(second>first+1&&nums[second]==nums[second-1]){
                    continue;
                }
                for(third=second+1,forth=length-1;third<length-1&&third<forth;){
                    if(third>second+1&&nums[third]==nums[third-1]){
                        ++third;
                        continue;
                    }
                    if(forth<length-1&&nums[forth]==nums[forth+1]){
                        --forth;
                        continue;
                    }
                    int sum = nums[first]+nums[second]+nums[third]+nums[forth];
                    if(sum == target){
                        List<Integer> array = new ArrayList<>(4);
                        array.add(nums[first]);
                        array.add(nums[second]);
                        array.add(nums[third]);
                        array.add(nums[forth]);
                        quadruplets.add(array);
                        ++third;
                        --forth;
                    }else if(sum<target){
                        //sum比较小，那么增大较小的一边
                        ++third;
                    }else{
                        --forth;
                    }
                }
            }
        }
        return quadruplets;
    }
}
