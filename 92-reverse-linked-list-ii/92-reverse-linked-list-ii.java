class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right || head == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy, post = dummy; 
        
        for (int i = 1; i <= right+1; i++) {
            if (i < left) pre = pre.next;     //Find the pre node (i.e. node before Start node)
            post = post.next;                 //Find the post node (i.e. node after End node)
        }
        ListNode start = pre.next;
        ListNode temp = post;                 //temp is reverse part which is followed by post node
		
        while (start != post) {
            ListNode next = start.next;
            start.next = temp;
            temp = start;
            start = next;
        }
		
        pre.next = temp;   // pre node is followed by reversed part 
        return dummy.next;
    }
}