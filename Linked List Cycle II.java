public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode meet=detect(head);
        if(meet==null)return meet;
        ListNode temp=head;
        while(temp!=meet){
            temp=temp.next;
            meet=meet.next;
        }
        return temp;
    }
    public ListNode detect(ListNode node){
        ListNode slow=node;
        ListNode fast=node;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)return fast;
        }
        return null;
    }
}
