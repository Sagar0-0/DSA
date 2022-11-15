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
    public ListNode partition(ListNode head, int x) {
        ListNode temp=head;
        ListNode small=new ListNode(-1);
        ListNode smallEnd=small;
        ListNode large=new ListNode(-1);
        ListNode currLarge=large;
        while(temp!=null){
            ListNode curr=temp;
            temp=temp.next;
            curr.next=null;
            if(curr.val<x){
                smallEnd.next=curr;
                smallEnd=smallEnd.next;
            }else{
                currLarge.next=curr;
                currLarge=currLarge.next;
            }
        }
        smallEnd.next=large.next;
        return small.next;
    }
}