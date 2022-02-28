package leecode.c20;

import java.util.Stack;

public class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
    //        int small= 0,mid=0,big=0;
            for (int i=0;i<s.length();++i){
                char c = s.charAt(i);
                switch (c){
                    case '{':
                        stack.push(c);
    //                    ++big;
                        break;
                    case '[':
                        stack.push(c);
    //                    ++mid;
                        break;
                    case '(':
                        stack.push(c);
    //                    ++small;
                        break;
                    case ')':
                        if(stack.isEmpty()){
                            return false;
                        }
                        char p = stack.pop();
                        if(p!='('){
                            return false;
                        }
    //                    --small;
                        break;
                    case ']':
                        if(stack.isEmpty()){
                            return false;
                        }
                        char m = stack.pop();
                        if(m!='['){
                            return false;
                        }
    //                    --mid;
                        break;
                    case '}':
                        if(stack.isEmpty()){
                            return false;
                        }
                        char b = stack.pop();
                        if(b!='{'){
                            return false;
                        }
    //                    --big;
                        break;
                    default:
                }
            }
            return stack.isEmpty();
        }
}
