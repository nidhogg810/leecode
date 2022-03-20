package leecode.c42;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int trap(int[] height){
        int sum = 0;
        Deque<Integer> stack = new LinkedList<>();
        int current=0;
        while (current<height.length){
            while (!stack.isEmpty()&& height[current] > height[stack.peek()]){
                int h = height[stack.peek()];
                stack.pop();
                if(stack.isEmpty()){
                    break;
                }
                //计算水量
                int distance = current - stack.peek()-1;
                int min = Math.min(height[stack.peek()],height[current]);
                sum = sum+distance*(min-h);
            }
            stack.push(current);
            ++current;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.trap(new int[]{0,1,2,2,1,0,1,3,2,1,2,1}));
    }
}
