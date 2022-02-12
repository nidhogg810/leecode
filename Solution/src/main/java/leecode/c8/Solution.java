package leecode.c8;




import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int myAtoi(String s) {

        int length = s.length();
        Automaton automaton = new Automaton();
        for(int i=0; i<length;++i){
            automaton.statChange(s.charAt(i));
        }
        int result = (int) (automaton.sign*automaton.ans);
        return result;
    }

    /**
     * 状态机，statetable记录一个表格，表示当前的状态接收字符，得到什么状态
     */
    class Automaton{
        int sign = 1;//正负
        Map<String, String[]> stateTable = new HashMap<String,String[]>(){{
            put("start",new String[]{"start","signed","in_number","end"});
            put("signed",new String[]{"end","end","in_number","end"});
            put("in_number",new String[]{"end","end","in_number","end"});
            put("end",new String[]{"end","end","end","end"});
        }};
        String state = "start";
        Long ans = 0l;

        void statChange(char c){
            state = stateTable.get(state)[getNextStateIndex(c)];
            if("signed".equals(state)){
                sign = c=='-'? -1:1;
            }else if("in_number".equals(state)){
                boolean tmpflag = sign ==-1? ans == -(long)Integer.MIN_VALUE : ans==Integer.MAX_VALUE;
                if(!tmpflag) {
                    ans = ans * 10 + (c - '0');
                    if (sign == -1) {
                        ans = Math.min(ans, -(long) Integer.MIN_VALUE);
                    } else {
                        ans = Math.min(ans, Integer.MAX_VALUE);
                    }
                }
            }
        }
        int getNextStateIndex(char c){
            if(c == ' '){
                return 0;
            }
            if(c =='+'|| c== '-'){
                return 1;
            }
            if(Character.isDigit(c)){
                return 2;
            }
            return 3;
        }
    }


}
