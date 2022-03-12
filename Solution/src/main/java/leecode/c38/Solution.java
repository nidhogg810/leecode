package leecode.c38;

public class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String str = countAndSay(n-1);
        return find(str,0,str.length());
    }

    String find(String str,int beginPos,int endPos){
        if(endPos-beginPos==1){
            return str.charAt(beginPos)+"1";
        }else if(endPos==beginPos){
            return "";
        }
        int cnt = 0;
        char last = str.charAt(beginPos);
        int i;
        for(i=beginPos;i<str.length()&&i<endPos;++i){
            char tmp = str.charAt(i);
            if(tmp != last){
                break;
            }
            ++cnt;
        }
        return String.valueOf(cnt)+last+find(str,beginPos+cnt,endPos);
    }
}
