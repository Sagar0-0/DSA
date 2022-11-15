// Runtime: 11 ms, faster than 10.15% of Java online submissions for Reorder List.
// Memory Usage: 54.4 MB, less than 29.31% of Java online submissions for Reorder List.
class Solution {
    public void reorderList(ListNode head) {
        ListNode curr = head;
        
        Stack<ListNode> s = new Stack<>();

        while(curr != null) {
            s.push(curr);
            curr = curr.next;
        }
        curr = head;
        int n = s.size();
        if(n<=2) return;
        ListNode next;
        for(int i = 0; i < n/2; i++) {
            next = curr.next;
            curr.next = s.peek();
            s.pop();
            curr = curr.next;
            curr.next = next;
            curr = curr.next;
        }
        curr.next = null;
    }
}
