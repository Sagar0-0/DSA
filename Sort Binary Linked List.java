public class Solution {
    public ListNode solve(ListNode A) {
        ListNode head = A;
        ListNode curr = A;
        ListNode prev = null;
        ListNode next = null;
        while (curr != null){
            next = curr.next;
            if(curr.val == 0){
                if(prev != null){
                    prev.next = next;
                    curr.next = head;
                    head = curr;
                }else {
                    prev = curr;
                }
            }else {
                prev = curr;
            }
            curr = next;
        }
        return head;
    }
}
