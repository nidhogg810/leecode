package leecode.c22;

import java.util.*;

public class Solution {
        Set<String>[] cache = new HashSet[10];

        String front = "(";
        String after = ")";
        public List<String> generateParenthesis(int n) {

            return change(n).stream().toList();
        }
        private Set<String> change(int n){
            Set<String> tmp = new HashSet<>();
            if(cache[n]!=null){
                return cache[n];
            }
            if(n==0){
                tmp.add("");
                cache[0] = tmp;
            } else if(n == 1){
                tmp.add(front+after);
                cache[1] = tmp;
            }else{
                for(int c=0;c<n;++c){
                    for(String left:change(c)){
                        for(String right:change(n-c-1)){
                            tmp.add(front+left+after+right);
                        }
                    }
                }
            }
            return tmp;
        }
}
