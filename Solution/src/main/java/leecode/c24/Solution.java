package leecode.c24;

import java.util.Objects;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(Objects.isNull(head)){
            return null;
        }
        ListNode virtual = new ListNode(0,head);
        ListNode pre = virtual;
        ListNode index = head;
        ListNode after = head.next;
        while (!Objects.isNull(after)){
            change(pre,index,after);
            if(index.next == null){
                break;
            }
            pre = index;
            index = index.next;
            after = index.next;
        }
        return virtual.next;
    }
    private void change(ListNode pre,ListNode index,ListNode after){
            index.next = Objects.isNull(after.next)? null:after.next;
        after.next = index;
        pre.next = after;
    }
}
