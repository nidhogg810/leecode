package leecode.c11;

import java.util.Scanner;

public class Solution {
    public int maxArea(int[] height) {
        int[][] area = new int[height.length][height.length];
        int max = 0;
        for(int i=0,j=height.length-1;i<height.length&&i!=j;){
            int left = height[i];
            int right = height[j];
            max = Math.max(max,cal(height,i,j));
            if(left<right){
                //找到里面较小的一个，开始移动
                ++i;
                if(left>height[i]){
                    continue;
                }
            }else{
                --j;
                if(right>height[j]){
                    continue;
                }
            }

        }
        return max;
    }
    private int cal(int[] height,int i,int j){
        return Math.min(height[i],height[j])*(j-i);
    }

    public static void main(String[] args){
        String s;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        String[] strings = s.split(",");
        int[] heigh = new int[strings.length];
        for(int i=0;i<strings.length;i++){
            heigh[i]=Integer.parseInt(strings[i]);
        }

        Solution solution = new Solution();
        System.out.println(solution.maxArea(heigh));
    }
}
