//Faster
class Solution {
    public ListNode sortList(ListNode head) {
        int len = 0;
        ListNode h = head;
        while (h != null) {
            len++;
            h = h.next;
        }
        
        int[] tmp = new int[len];
        
        h = head;
        for (int i = 0; i < len; i++) {
            tmp[i] = h.val;
            h = h.next;
        }
        
        Arrays.sort(tmp);
        
        h = head;
        for (int i = 0; i < len; i++) {
            h.val = tmp[i];
            h = h.next;
        }
        
        return head;
    }
}
