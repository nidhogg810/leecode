package leecode.c32;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Solution {
    //给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
    public int longestValidParentheses(String s) {
        Deque<Integer> stack = new LinkedList<>();
        int length=0;
        stack.push(-1);
        for(int i=0;i<s.length();++i){
            char c = s.charAt(i);
            if(c=='('){
                stack.push(i);
            }else if (c==')'){
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    length = Math.max(length,i-stack.peek());
                }
            }
        }
        return length;
    }
}
