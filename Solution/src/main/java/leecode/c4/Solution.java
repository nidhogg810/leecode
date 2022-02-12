package leecode.c4;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length+nums2.length;
        boolean flag = (length%2==1);

        if(flag){
            //奇数
            //中位数是第n/2+1大小的数
            int k = length/2+1;
            return findKthElement(nums1,nums2,k);
        }else{
            //偶数
            int k = length/2;
            int result0 = findKthElement(nums1,nums2,k);
            int result1 = findKthElement(nums1,nums2,k+1);
            return (result0+result1)/2d;
        }
    }

    private int findKthElement(int[] list1,int[] list2,int k){
        int index1 = 0,index2 = 0;
        int length1 = list1.length,length2 = list2.length;
        while (true){
            //防out of bound
            if(index1 == length1){
                return list2[index2+k-1];
            }
            if(index2 == length2){
                return list1[index1+k-1];
            }
            //边界跳出条件
            if(k == 1){
                return Math.min(list1[index1],list2[index2]);
            }

            //其他的正常推进情况
            int half = k/2;
            //index是上一次的算到的位置，newIndex是本次尝试的位置
            int newIndex1 = Math.min(length1,index1+half)-1;
            int newIndex2 = Math.min(length2,index2+half)-1;
            int pivot1 = list1[newIndex1];
            int pivot2 = list2[newIndex2];
            if(pivot1<=pivot2){
                k -= (newIndex1-index1+1);
                index1 = newIndex1+1;
            }else {
                k -= (newIndex2-index2+1);
                index2 = newIndex2+1;
            }

        }

    }

    private int[] split(int[] list,int begin,int end){
        int[] result = new int[end-begin];
        if(end <= begin || end > list.length){
            throw new IllegalArgumentException("begin or end pos error");
        }
        for(int i=begin,j=0;i<end;++i,++j){
            result[j] = list[i];
        }
        return result;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums= new int[]{2,3,4,5};
        int[] sp= solution.split(nums,1,4);
        System.out.println(Arrays.toString(sp));
    }

}
