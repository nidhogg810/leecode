package leecode.c1;

import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
    public static ListNode instance(int[] vals){
        ListNode head = new ListNode(vals[0]);
        ListNode last = head;
        for(int i=1;i<vals.length;i++){
            ListNode temp = new ListNode(vals[i]);
            last.next = temp;
            last = temp;
        }
        return head;
    }
    @Override
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        if(!Objects.isNull(next)){
            stringBuffer.append(val).append("->").append(next);
        }else{
            stringBuffer.append(val).append(".");
        }
        return stringBuffer.toString();
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof ListNode) {
            ListNode o = (ListNode) obj;
            if(Objects.isNull(next)){
                return val == o.val;
            }
            return val == o.val && next.equals(o.next);
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        int[] num1 = new int[]{2,4,3};
        ListNode l1 = ListNode.instance(num1);
        ListNode l2 = ListNode.instance(num1);
        System.out.println(l1);
        System.out.println(l1.equals(l2));
    }
}
