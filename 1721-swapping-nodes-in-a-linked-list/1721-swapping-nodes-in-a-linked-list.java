/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode fast=head; 
        ListNode slow=head;  
        int count=1;
        while(fast !=null && count <k){ 
            fast=fast.next;
            count++;
        }
		//move fast k-1 time ahead of slow 
        ListNode fkth=fast;
        while(fast.next !=null ){
            fast=fast.next; 
            slow=slow.next;
        }
		//fast.next=null
		//slow is equal to kth from end of the list
        //swapping
       int temp=fkth.val;
       fkth.val=slow.val;
       slow.val=temp;
        
        return head;
    }
}