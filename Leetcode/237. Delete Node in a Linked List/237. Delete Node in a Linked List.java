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
      // coping the value of the next node into the current node
        node.val = node.next.val;
      // removing the link to the next node and linking the next pointer to the node after
        node.next = node.next.next;
    }
}
