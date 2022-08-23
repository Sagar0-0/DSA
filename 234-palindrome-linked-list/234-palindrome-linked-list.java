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
    public boolean isPalindrome(ListNode head) {
        ListNode node=head;
        int sz=0;
        while(node!=null){
            node=node.next;
            sz++;
        }
        if(sz==1)return true;
        ListNode curr=head;
        ListNode prev=null;
        for(int i=0;i<sz/2;i++){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        if(sz%2!=0){
            curr=curr.next;
        }
        while(prev!=null || curr!=null){
            if(prev.val!=curr.val)return false;
            prev=prev.next;
            curr=curr.next;
        }
        if(curr==null && prev==null)return true;
        return false;
    }
}