package leecode.c30;

import java.util.*;

public class Solution {
    /**
     *
     * 给定一个字符串s和一些 长度相同 的单词words 。找出 s 中恰好可以由words 中所有单词串联形成的子串的起始位置。
     *
     * 注意子串要与words 中的单词完全匹配，中间不能有其他字符 ，但不需要考虑words中单词串联的顺序。
     *
     * @param s
     * @param words
     * @return
     */
    public List<Integer> findSubstring(String s, String[] words) {
        int n = words[0].length();
        //我们可以将n个字符作为一个单元
        int left=0,right = words.length*n;
        List<Integer> result = new ArrayList<>();
        while (right<=s.length()){
            Integer subList = check(s.substring(left,right),words,n,left);
            if(subList!=null){
                result.add(subList);
            }
            left += n;
            right += n;
        }
        return result;
    }

    public Integer check(String str,String[] words,int x,int begin){
        HashMap<String,Integer> wordsTab = new HashMap<>(words.length);
        Integer result = begin;
        for(String st:words){
            Integer v = wordsTab.getOrDefault(st,0)+1;
            wordsTab.put(st,v);
        }
        LinkedHashMap<String,Integer> tempTab = new LinkedHashMap<>(words.length);
        for(int i=0;i<str.length();){
            String tmp = str.substring(i,i+x);
            Integer v = tempTab.getOrDefault(tmp,0)+1;
            tempTab.put(tmp,v);
            i+=x;
        }
        if(tempTab.size()!= wordsTab.size()){
            return null;
        }

        for(String key:tempTab.keySet()){
            if(wordsTab.containsKey(key)){
                if(tempTab.get(key) != wordsTab.get(key)){
                    result = null;
                    break;
                }
            }else {
                result = null;
                break;
            }
        }

        return result;
    }

}
