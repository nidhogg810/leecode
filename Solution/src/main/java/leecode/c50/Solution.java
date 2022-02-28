package leecode.c50;

public class Solution {
    public double myPow(double x, int n) {
        Long nlong = (long) n;
        if(x==1){
            return 1;
        }
        if(x==-1){
            return nlong%2==0? 1:-1;
        }
        if(x==0){
            return 0;
        }
        return n>=0? quickPow(x,nlong):1.0d/quickPow(x,-nlong);
    }
    public double quickPow(double x, long n){
        if(n==0){
            return 1.0;
        }
        if(n==1){
            return x;
        }else if(n==2){
            return x*x;
        }else if(n>2) {
            double y = quickPow(x,n/2);
            return n%2==0? y*y:y*y*x;
        }else{
            return 1;
        }
    }
}
