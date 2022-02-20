class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head.next;
        ListNode start=head;
        ListNode end=new ListNode(-1);
        while(start.next!=null){
            int sum=0;
            while(temp.val!=0){
                sum+=temp.val;
                temp=temp.next;
            }
            end=temp;
            ListNode newNode=new ListNode(sum);
            start.next=newNode;
            newNode.next=end;
            start=end;
            temp=temp.next;
        }
        
        temp=head.next;
        while(temp!=null){
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return head.next;
    }
}
