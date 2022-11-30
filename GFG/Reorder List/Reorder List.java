class Solution {
    Node reorderlist(Node head) {
        // Your code here
        if(head.next==null)return head;
        Node fast=head;
        Node slow=head;
        Node prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        Node revHead=reverse(slow);
        Node startHead=head;
        while(startHead!=null){
            Node startNext=startHead.next;
            Node revNext=revHead.next;
            startHead.next=revHead;
            if(startNext!=null)revHead.next=startNext;
            startHead=startNext;
            revHead=revNext;
        }
        return head;
    }
    Node reverse(Node head){
        Node prev=null;
        while(head!=null){
            Node next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}
