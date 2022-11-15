public class Solution {
    public ListNode insertionSortList(ListNode A) {
        ListNode prev = null, cur = A, head = new ListNode(Integer.MIN_VALUE), next = null;
        prev = head;
        ListNode temp = head;
        //so we’ve declared head pointer with the least min val, -inf, and it will serve the purpose of prev pointer
        //basically, everything will be added after that!!
        while (cur != null) {
            //for each item, do
            //take the cur pointer and set next pointer to cur.next,
            //i.e. hold the next pointer so we don’t loose it
            temp = head;
            next = cur.next;
            //call a function, insert
            iinsert(head, cur);
            //after inserting, update our pointer
            cur = next;
        }
        //return everthing other than -inf
        return head.next;
    }
    //insert funct
    public static void iinsert(ListNode head, ListNode in ) {
        ListNode temp = head, prev = null;
        //for all values starting from -inf, check whether, cur val is lesser than the
        //end of the sorted list [-inf…end]
        while (temp != null) {

            if (temp.val > in.val) {
                //if there is some faulty node, 'en insert it b/w prev and temp
                prev.next = in ; in.next = temp;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
        prev.next = in;
        //make sure to cut off some extra nodes
        in.next = null;
        return;
    }
}
