package leecode.c23;


public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        return mergeLists(lists,0,lists.length-1);
    }

    public ListNode mergeLists(ListNode[] lists,int start,int end){
        if(start ==end){
            return lists[start];
        }else if(end-start+1 == 2){
            return mergeTwoLists(lists[start],lists[end]);
        }else{
            int t = (start+end)/2;
            return mergeTwoLists(mergeLists(lists,start,t),mergeLists(lists,t+1,end));
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = new ListNode(Integer.MIN_VALUE,list1);
        ListNode head2 = new ListNode(Integer.MIN_VALUE,list2);
        ListNode index = head1;
        while(index.next!=null||head2.next!=null){
            if(index.next == null){
                index.next = head2.next;
                break;
            }
            //如果head2是空的，那么直接返回head1没问题
            if(head2.next == null){
                break;
            }
            int va1 = index.next.val;
            int va2 = head2.next.val;
            if(va2<=va1){
                ListNode tmp = head2.next;
                head2.next = head2.next.next;
                tmp.next = index.next;
                index.next = tmp;
            }
            index = index.next;
        }
        return head1.next;
    }
}
