package leecode.c15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int[] lists = nums;
        Arrays.sort(lists);
        if(lists[0]*lists[lists.length-1]>0){
            //最小值和最大值同号，那么不可能三个数a+b+c=0
            return new ArrayList<>();
        }
        for (int i=0;i<lists.length;++i){
            for (int j;j<lists.length;++j){
                for (int k = lists.length-1;k>=0;--k){
                    
                }
            }
        }
    }
}
