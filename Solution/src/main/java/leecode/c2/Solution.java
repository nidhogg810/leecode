package leecode.c2;

import java.util.Objects;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode resultHead = null,tail = null;
        ListNode insResult = resultHead;
        //进位存储器
        int temp = 0;
        for(int i = 0; i<100;i++){
            if(!Objects.isNull(l1)||!Objects.isNull(l2)){
                int num1 = !Objects.isNull(l1)? l1.val : 0;
                int num2 = !Objects.isNull(l2)? l2.val : 0;
                int sum = num1+num2+temp;
                temp = sum / 10;
                if (resultHead == null) {
                    resultHead = new ListNode(sum%10);
                    tail = resultHead;
                }else{
                    tail.next = new ListNode(sum%10);
                    tail = tail.next;
                }
                if(!Objects.isNull(l1)){
                    l1 = l1.next;
                }
                if(!Objects.isNull(l2)){
                    l2 = l2.next;
                }
                if(temp>0){
                    tail.next = new ListNode(temp);
                }
            }else{
                break;
            }
        }
        return resultHead;
    }
}
