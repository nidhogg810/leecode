package leecode.c14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int maxPrefixLeng = Integer.MAX_VALUE;
        for(String tmp : strs){
            maxPrefixLeng = Math.min(maxPrefixLeng,tmp.length());
        }
        String s = strs[0].substring(0,maxPrefixLeng);

        for (String tmp : strs) {
            if("".equals(s)){
                return s;
            }
            if (!tmp.startsWith(s)){
                s = commonPrefix(s,tmp);
            }

        }
        return s;
    }
    public String commonPrefix(String p1,String p2){
       int i = 0;
       int j = 0;
       StringBuffer sb = new StringBuffer();
       for(;i<p1.length()&&j<p2.length();++i,++j){
           if(p1.charAt(i)==p2.charAt(j)){
               sb.append(p1.charAt(i));
           }else {
               break;
           }
       }
       return sb.toString();
    }
}
