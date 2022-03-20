package leecode.c46;

import java.util.*;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Boolean> used = new ArrayList<Boolean>() {{
            for(int k=0;k< nums.length;++k){
                this.add(false);
            }
        }};
        List<List<Integer>> ans = new ArrayList<>();
        Deque<Integer> stack = new LinkedList<>();
        dfs(ans,nums,0,used,stack);
        return ans;
    }
    public void dfs(List<List<Integer>> ans, int[] num, int depth, ArrayList<Boolean> use, Deque<Integer> stack){
        if(used(use)&&depth == num.length){
            ans.add(new ArrayList<>(stack));
            return;
        }
        int i = 0;
        for(;i<use.size();++i){
            if(!use.get(i)){
                stack.add(num[i]);
                use.set(i,true);
                dfs(ans,num,depth+1,use,stack);
                stack.removeLast();
                use.set(i,false);
            }
        }

    }
    private boolean used(ArrayList<Boolean> used){
        for (boolean b:used){
            if(!b){
                return false;
            }
        }
        return true;
    }


}
