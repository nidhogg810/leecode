package leecode.c5;

import java.util.Arrays;

public class Solution {
    public String longestPalindrome(String s){
        int[] rs = null;
        for(int index = 0; index<s.length();++index){
            int[] palindrome1 = growPalindrome(s,index,index);
            int[] palindrome2 = null;
            if(index+1<s.length()){
                palindrome2 = growPalindrome(s,index,index+1);
            }
            rs = max(palindrome1,palindrome2,rs);
        }
        if(rs!=null){
            return s.substring(rs[0],rs[1]+1);
        }else{
            return s.substring(0,1);
        }
    }

    private int[] growPalindrome(String s,int begin,int end){
        int[] rs = null;
//        if(begin==end){
//            rs[0] = begin;
//            rs[1] = end;
//            return rs;
//        }
        if(s.charAt(begin)==s.charAt(end)) {
            rs = new int[2];
            //本身属于回文
            int i = begin, j = end;
            while (i >= 0 && j < s.length()) {
                //grow up
                if(s.charAt(i)!=s.charAt(j)){
                    break;
                }
                --i;
                ++j;
            }
            rs[0] = i+1;
            rs[1] = j-1;
        }
        return rs;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.growPalindrome("cbbd", 1, 1)));
    }

    private int[] max(int[] slip1,int[] slip2,int[] slip3){
        return max(max(slip1,slip2),slip3);
    }

    private int[] max(int[] slip1,int[] slip2){
        if(slip1 == null){
            return slip2;
        }
        if(slip2 == null){
            return slip1;
        }

        if(slip1[1]-slip1[0]>slip2[1]-slip2[0]){
            return slip1;
        }else {
            return slip2;
        }
    }
}
