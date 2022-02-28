package leecode.c206;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] t = new int[]{5,6,7,8,9,1,2,3,4};
        System.out.println(findMid(t));
    }

    private static double findMid(int[] args){
        int n = args.length;
        int k = 0;
        for(int i=1;i<n;++i){
            if(args[i-1]>args[i]){
                k = i;
                break;
            }
        }
        //这个地方从0-k,是数组的后半段,k+1 到n是数组的前半段
        int t = n-k;//前半段有几个数
        int mid1 = 0,mid2 = 0;
        if(n%2==1){
            mid1 = n/2;
            if(mid1<=t){
                mid1 = mid1-t;
            }
            return args[mid1];
        }else{
            mid1 = n/2;
            mid2 = n/2+1;
            if(mid1<=t){
                mid1 = mid1-t;
            }
            if(mid2<=t){
                mid2 = mid2-t;
            }
            return (args[mid1]+args[mid2])/2.0d;
        }
    }
}