package leecode.c3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    //无重复字符最长子串的长度
    //尝试使用滑动窗口方法来解决问题
    public int lengthOfLongestSubstring(String s){
        Set<Character> charSet = new HashSet<>();
        int result = 0;
        //要考虑到结果至少能为1
        int windBiginPos=0;
        //左开右闭区间，这个endPos表示将要（尝试）加入window的字符位置
        int windEndPos=0;
        int max = 0;
        for (;windBiginPos<s.length();windBiginPos++){
            if(windBiginPos!=0){
                charSet.remove(s.charAt(windBiginPos-1));
            }
            //开始准备移动窗口
            while (windEndPos<s.length()&&!charSet.contains(s.charAt(windEndPos))){
                charSet.add(s.charAt(windEndPos));
                windEndPos++;
            }
            max = Math.max(max,windEndPos-windBiginPos);
        }
        return max;
    }

}




//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        // 记录字符上一次出现的位置
//        int[] last = new int[128];
//        for(int i = 0; i < 128; i++) {
//            last[i] = -1;
//        }
//        int n = s.length();
//
//        int res = 0;
//        int start = 0; // 窗口开始位置
//        for(int i = 0; i < n; i++) {
//            int index = s.charAt(i);
//            start = Math.max(start, last[index] + 1);
//            res   = Math.max(res, i - start + 1);
//            last[index] = i;
//        }
//
//        return res;
//    }
//}
