package leecode.c19;

import java.util.Stack;

public class Solution {
    /**
     * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
     *
     * 倒数----倒数即可使用栈来解决问题
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode index=null,last=null,pre=null;
        Stack<ListNode> stack = new Stack<>();
        //做一个虚地址
        ListNode viual = new ListNode(Integer.MIN_VALUE,head);
        index = viual;
        while (index!=null){
            stack.push(index);
            index = index.next;
        }
        index = null;
        int i = 0;
        int length = stack.size();
        for(i = 1;i<=n+1&&i<=length;++i){
            pre = stack.pop();
            index = pre.next == null? null:pre.next;
            last = index==null||index.next==null?null:index.next;
        }

        //找到地方只有开始删除
        pre.next = last;
        return viual.next==null? new ListNode():viual.next;
    }
}
