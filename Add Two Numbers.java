class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        
        ListNode dummyHead = new ListNode(-1);
        ListNode curr = dummyHead;
        
        while (l1 != null || l2 != null) {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;
            
            int sum = v1 + v2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            
            curr.next = new ListNode(sum);
            curr = curr.next;
            
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
        }
        
        if (carry == 1) {
            curr.next = new ListNode(1);
        }
        
        return dummyHead.next;
    }
}
