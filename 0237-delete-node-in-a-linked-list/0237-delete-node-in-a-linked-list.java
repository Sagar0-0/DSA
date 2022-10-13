/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if(node.next.next==null){
            node.val=node.next.val;
            node.next=null;
            return;
        }
        node.val=node.next.val;
        deleteNode(node.next);
    }
}