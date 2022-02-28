package leecode.c17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    Map<Character,String> cache = new HashMap<Character,String>(){{
        put('1',"");
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");
    }};
    public List<String> letterCombinations(String digits) {
        int number = digits.length();
        List<String> stringList = new ArrayList<>();
        StringBuffer stringBuffer = new StringBuffer();
        cal(digits,0,stringList,stringBuffer);
        return stringList;
    }

    private void cal(String digits,int index,List<String> stringList,StringBuffer stringBuffer){
        if(index == digits.length()){
            stringList.add(stringBuffer.toString());
        }else{
            char c = digits.charAt(index);
            String str = cache.get(c);
            for(int i=0;i<str.length();++i){
                stringBuffer.append(str.charAt(i));
                cal(digits, index+1, stringList, stringBuffer);
                stringBuffer.deleteCharAt(index);
            }
        }
    }

}
