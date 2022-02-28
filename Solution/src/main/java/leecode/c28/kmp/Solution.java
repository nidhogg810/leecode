package leecode.c28.kmp;

public class Solution {
    public int strStr(String haystack, String needle) {
        return kmp(haystack, needle);
    }

    public int kmp(String str,String pattern){
        //str上的指针
        int i = 0;
        //pattern上的指针
        int j = 0;
        int[] next = preCalNext(pattern);
        for(;i<str.length();++i){
//            if(j==0&&str.charAt(i)!=pattern.charAt(j)){
//                j=0;
//            }
            while(j>0&&str.charAt(i)!=pattern.charAt(j)){
                //如果指针位置不相等
                //那么我们需要移动pattern指针
                //来寻找到下一次的位置next
                //这个位置next应该满足下面的条件：
                //对于从起始位置开始，到next前的共next-1个元素的子串
                //j前的next-1个元素的子串，
                //两者相等
                //即pattern[0:next-1]=pattern[j-1-(next-1)+1:j-1]
                j = next[j-1];
            }
            if(str.charAt(i)==pattern.charAt(j)){
                ++j;
            }
            if(j == next.length){
                //如果pattern上的指针推进到最好一位,
                //且最后一位字符也匹配上了
                //说明pattern匹配完成
                return i-(next.length-1);
            }

        }
        return -1;
    }

    int[] preCalNext(String pattern){
        int[] next = new int[pattern.length()];
        next[0] = 0;
        for(int i=1,j=0;i<next.length;){
            if(j==0&&pattern.charAt(i)!=pattern.charAt(j)){
                next[i] = 0;
                ++i;
            }else if (pattern.charAt(i)==pattern.charAt(j)){
                next[i] = next[j]+1;
                ++i;
                ++j;
            }else{
                j = next[j-1];
            }
        }
        return next;
    }

    int[] pre(String pattern){
        int m = pattern.length();
        int[] pi = new int[m];
        for (int i = 1, j = 0; i < m; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = pi[j - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            pi[i] = j;
        }
        return pi;
    }
}
