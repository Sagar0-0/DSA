class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null)return null;
        if(head.next==null)return head;
        ListNode rec=swapPairs(head.next.next);
        ListNode sec=head.next;
        sec.next=head;
        head.next=rec;
        return sec;
    }
}
