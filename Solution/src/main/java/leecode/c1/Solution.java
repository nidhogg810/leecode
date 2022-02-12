package leecode.c1;

import java.util.HashMap;
import java.util.Objects;

public class Solution {
    //暴力
    public int[] twoSum(final int[] nums, final int target) {
        int[] result = new int[2];
        int x;
        for (int i = 0; i < nums.length; i++) {
            x = nums[i];
            result[0] = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - x) {
                    result[1] = j;
                    //找到了
                    return result;
                }
            }
        }
        return result;
    }
    //如果我考虑将这个数组保存成一个二叉树，一个由数组形式存储的二叉树
    //那么树向下搜索的nlogn,再加上一共可能要搜索n个元素，这个效率可能就是n*nlogn
    //可以想到后面我们的搜索target-x不管做的多好，至少对于整体来说是有个n次的
    //那么搜索算法的时间复杂度最多只有n
    //满足这个的数据结构只有哈希表
    //开始复习hash table
    public int[] twoSum_hashtable(final int[] nums, final int target) {
        HashMap<Integer,Integer> hashTable = new HashMap<>();
        //如果这个地方分两步，首先一起存入列表，然后再一个个搜索target-x，那么时间是2n
        //是否可以再遍历存入的过程中，同时比较。还要注意消除自身和自身匹配的问题
        for(int i=0;i<nums.length;i++){
            //如果先存表，再匹配，则不能排除自身匹配
            if(hashTable.containsKey(target-nums[i])){
                return new int[] {i,hashTable.get(target-nums[i])};
            }else{
                hashTable.put(nums[i],i);
            }
        }
        return new int[]{};
    }

}
