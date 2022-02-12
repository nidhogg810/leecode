package leecode.c6;

import java.util.ArrayList;

public class Solution {
    public String convert(String s, int numRows){
        if(numRows<=1){
            return s;
        }

        ArrayList<StringBuffer> rows = new ArrayList<StringBuffer>();
        for (int i = 0;i<numRows;i++) {
            rows.add(new StringBuffer());
        }
        for(int index=0;index<s.length();++index){
            int x = index/(numRows-1);
            int r = 0;
            if(x%2 == 0){
                r = index-x*(numRows-1);
            }else{
                r = (x+1)*(numRows-1)-index;
            }
            StringBuffer rowList = rows.get(r);

            rowList.append(s.charAt(index));
        }
        StringBuffer sb = new StringBuffer();
        for(StringBuffer st:rows){
            sb.append(st.toString());
        }
        return sb.toString();
    }


}
