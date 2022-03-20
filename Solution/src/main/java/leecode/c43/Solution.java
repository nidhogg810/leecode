package leecode.c43;

import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Solution {
    //对于任意i,j, num1[i]和num2[j]的结果位于ansArrays[i+j+1]，进位结果位于ansArrays[i+j]
    public String multiply(String num1, String num2) {
        int index1 = num1.length()-1,len1 = num1.length();
        int index2 = num2.length()-1,len2 = num2.length();
        String sum = "";

        int[] ans = new int[len1+len2];
        for(;index1>=0;--index1){
            index2 = len2-1;
            for (;index2>=0;--index2){
                int multi = (num1.charAt(index1)-'0')*(num2.charAt(index2)-'0');
                ans[index1+index2+1] += multi%10;
                ans[index1+index2] += multi/10;
                //保存进位
                int tmp = 0;
                if(ans[index1+index2+1]>=10){
                    tmp = ans[index1+index2+1]/10;
                    ans[index1+index2+1] = ans[index1+index2+1]%10;
                    ans[index1+index2] = ans[index1+index2]+tmp;
                }
            }
        }
        return arrays2String(ans);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.multiply("999","999"));
    }
    private String arrays2String(int[] ans){
        StringBuffer sb = new StringBuffer();
        for(int id=0;id<ans.length;++id){
            int tmp = 0;
            if(ans[id]>=10){
                tmp = ans[id]/10;
                ans[id] = ans[id]%10;
                ans[id-1] = ans[id-1]+tmp;
            }
            sb.append(ans[id]);
        }
        return sb.toString();
    }
}
