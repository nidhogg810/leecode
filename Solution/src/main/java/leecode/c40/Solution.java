package leecode.c40;

import java.util.*;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Deque<Integer> stack = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        dfs(candidates,target,0,stack,ans);
        return ans;
    }

    /**
     *
     * @param candidates
     * @param target
     * @param begin 这个begin，表示搜索[begin,n-1]这个区间里面的解决方案
     * @param stack
     * @param ans
     */
    public void dfs(int[] candidates, int target,int begin,Deque<Integer> stack,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(stack));
            return;
        }
        for(int i=begin;i<candidates.length;++i){
            if(target-candidates[i]<0){
                break;
            }
            if(i>begin&&candidates[i]==candidates[i-1]){
                continue;
            }
            stack.addLast(candidates[i]);
            dfs(candidates,target-candidates[i],i+1,stack,ans);
            stack.removeLast();
        }

    }
}
