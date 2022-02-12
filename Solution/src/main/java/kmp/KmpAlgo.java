package kmp;

public class KmpAlgo {
    public int[] calPartialMatchedTable(String pattern){
        int[] pmt = new int[pattern.length()];
        int largestLength = 0;
        pmt[0] = 0;
        for(int i=1;i<pattern.length();++i){
            while(largestLength>0&&(pattern.charAt(largestLength)!= pattern.charAt(i))){
                //我们需要注意一点，即i的pmt，不可能比前面的小，至少是相等
                largestLength = pmt[largestLength-1];
            }
            if(pattern.charAt(largestLength) == pattern.charAt(i)){
                ++largestLength;
            }
            pmt[i] = largestLength;
        }

        return pmt;
    }

    public int kmp(final String s,final String p){
        int[] pmt = calPartialMatchedTable(p);
        int k = -1;
        int sLength = s.length();
        int pLength = p.length();
        for(int i = 0;i<sLength;++i){
            //遍历每一个位置开始的子串
            while (k>-1 && s.charAt(i) != p.charAt(k+1)){
                //不断匹配，直到找到不相等的字符
                //然后得到当前位置的最大相同匹配子串
                k = pmt[k];
                // 回溯方式讲解：
                // 假设：
                // text:      ...abac...
                // pattern:      abad...
                // i指向c时，k指向第二个a，此时k+1指向d不等于c，那么需要回溯
                // 此时我们需要找的是 text[i-1-k, i-1] 子串中最大相同前后缀子字符串，
                // 因为 pattern[0, k] == text[i-1-k, i-1]
                // 而 pattern[0, k] 的最大相同前后子字符串之前已经算过了，是next[k]
            }
            if(p.charAt(k+1) == s.charAt(i)){
                k++;
            }
            if(k == pLength-1){
                return  i-pLength+1;
            }
        }


        return -1;
    }
}
