package leecode.c40;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

    }

    public void dfs(int[] candidates, int target,int idx,Deque<Integer> stack,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(stack));
            return;
        }
        dfs(candidates,target,idx+1,stack,ans);
        if(t)

    }
}
