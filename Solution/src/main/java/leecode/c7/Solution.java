package leecode.c7;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public int reverse(int x) {
        Queue<Integer> stack = new ArrayDeque<>();
        while (x!=0){
            stack.add(x%10);
            x /= 10;
        }
        int result=0;
        while (!stack.isEmpty()){
            int temp = stack.remove();
            if(checkOutOfBound(result)){
                result = result*10+temp;
            }else{
                return 0;
            }
        }

        return result;
    }

    private boolean checkOutOfBound(int res){

//        Integer.MIN_VALUE<=res*10+dig<=Integer.MAX_VALUE
//                return (Integer.MIN_VALUE)
//        我们需要注意到dig是不可能让算式出现进位的
        //同时，在位数为2^31是2147483647的相等时，dig只有2和1两种情况（边界条件），肯定小于7
        return (Integer.MIN_VALUE/10<=res)&&(res<=Integer.MAX_VALUE/10);
    }
}
