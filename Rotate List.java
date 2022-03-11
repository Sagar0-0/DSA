class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return null;
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        if(length==1)return head;
        k=k%length;
        ListNode newHead=rotate(head,k);
        return newHead;
    }
    public ListNode rotate(ListNode head,int k){
        if(k==0)return head;
        while(k!=0){
            ListNode temp=head;
            ListNode prev=null;
            while(temp.next!=null){
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
            temp.next=head;
            head=temp;
            k--;
        }
        return head;
        
    }
}
