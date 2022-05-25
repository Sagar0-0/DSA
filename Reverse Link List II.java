public class Solution {
    public ListNode reverseBetween(ListNode A, int B, int C) {

        ListNode temp = A;
        ListNode prevtemp = null;

        int count = 1;
        while(count<B) {
            count++;
            prevtemp= temp;
            temp= temp.next;
        }

        ListNode curr= temp;
        ListNode next = null;
        ListNode prev = null;

        count--;
        while(count<C) {
            count++;
            next = curr.next;
            curr.next= prev;
            prev = curr;
            curr = next;
        }

        if(prevtemp==null) {
            A = prev;
        } else {
            prevtemp.next = prev;
        }
        temp.next = curr;


        return A;
    }
}
