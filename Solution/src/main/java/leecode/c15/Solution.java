package leecode.c15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(Objects.isNull(nums)||nums.length < 3){
            return result;
        }
        int[] lists = nums;
        Arrays.sort(lists);
        if(lists[0]*lists[lists.length-1]>0){
            //最小值和最大值同号，那么不可能三个数a+b+c=0
            return new ArrayList<>();
        }

        for (int first=0;first<lists.length;++first){
            if(first>0 && lists[first] == lists[first-1]){
                continue;
            }
            int tempsum = -(lists[first]);
            int third = lists.length-1;
            for (int second=first+1;second<lists.length;++second){
                if (second > first + 1 && lists[second] == lists[second - 1]) {
                    continue;
                }
                while (second<third&&lists[second]+lists[third]>tempsum){
                    --third;
                }
                if(second==third){
                    break;
                }
                if(lists[second]+lists[third]==tempsum){
                    List<Integer> temp = new ArrayList<>(3);
                    temp.add(lists[first]);
                    temp.add(lists[second]);
                    temp.add(lists[third]);
                    result.add(temp);
                }
            }

        }
        return result;
    }


}
