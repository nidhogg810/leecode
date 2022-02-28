package leecode.c29;

public class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor ==1){
            return dividend;
        }
        if(divisor == -1){
            if(dividend == Integer.MIN_VALUE){
                return Integer.MAX_VALUE;
            }else{
                return -dividend;
            }
        }
        if(divisor  == Integer.MIN_VALUE){
            if(dividend == Integer.MIN_VALUE){
                return 1;
            }else{
                return 0;
            }
        }
        if(dividend == 0){
            return 0;
        }

        boolean dividendFlag = false;
        boolean divisorFlag = false;
        if(dividend>=0){
            dividendFlag = true;
            dividend = -dividend;
        }
        if(divisor>=0){
            divisorFlag = true;
            divisor = -divisor;
        }
        if(dividend>divisor){
            return 0;
        }
        int reFlag = divisorFlag==dividendFlag? 1:-1;
        int ans = 0;
        // 倍乘法，注意都是负数了，比较的时候与正数相反
        // 简单点理解，就是每次减去除数的 2^x 倍数，剩下的部分继续按这样的规则继续
        while ((divisor>=dividend)){
            int tmp = divisor, count = 1;
            while (tmp>=dividend-tmp){
                tmp += tmp;
                count += count;
            }
            dividend = dividend -tmp;
            ans+=count;
        }

        return reFlag>0? ans : -ans;
    }
}
