package leecode.c39;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combine = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        dfs(candidates,target,0,ans,combine);
        return ans;
    }

    public void dfs(int[] candidates,int target,int idx,List<List<Integer>> ans,List<Integer> combine){
        if(target == 0){
            ans.add(combine);
            return;
        }
        if(idx == candidates.length){
            return;
        }
        dfs(candidates, target,idx + 1, ans, combine);
        if(target-candidates[idx]>=0){
            combine.add(candidates[idx]);
            dfs(candidates,target-candidates[idx],idx,ans,combine);
            combine.remove(combine.size()-1);
        }
    }

}
