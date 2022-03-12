package leecode.c40;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

    }

    public void dfs(int[] candidates, int target, int depth,Deque<Integer> stack,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(stack));
            return;
        }
        if(depth)
        int i = 0;
        for(;i<candidates.length;++i){

        }
    }
}
