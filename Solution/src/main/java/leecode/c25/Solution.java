package leecode.c25;

import java.util.Stack;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode virtualNode = new ListNode(0,head);
        ListNode pre = virtualNode;
        ListNode after = null;
        ListNode index = head;
        while (index!=null){
            after = index;
            int i=0;
            for(;i<k&&after!=null;i++){
                after = after.next;
            }
            if(i<k){
                //after没有移动到预期位置，链表长度不足
                //不反转
                break;
            }else{
                ListNode[] nodes = reverseGroup(index,k,pre,after);
                index = nodes[0];
                pre = nodes[1];
            }

        }
        return virtualNode.next;
    }

    /**
     * 从start开始算，记n个节点的子链表，做倒序
     * @param start 起始节点
     * @param n 计算n个点
     * @param pre 子链表的前置节点
     * @param after 子链包的后置节点
     * @return 子链表原地倒序后的后置节点。同时pre已经移动到子链表的tail
     */
    private ListNode[] reverseGroup(ListNode start,int n,ListNode pre,ListNode after){
        Stack<ListNode> stack = new Stack<>();
        ListNode index = start;
        for(int i=1;i<=n;++i){
            stack.push(index);
            index = index.next;
        }
        for(int i=1;i<=n;++i){
            ListNode popNode = stack.pop();
            popNode.next = null;
            pre.next = popNode;
            pre=pre.next;
            if(i==n){
                pre.next = after;
                pre = start;
            }
        }
        return new ListNode[]{after,pre};
    }
}
