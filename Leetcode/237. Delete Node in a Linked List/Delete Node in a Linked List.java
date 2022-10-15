class Solution {
    public void deleteNode(ListNode node) {
     
        ListNode newnode=node.next;
        node.val=newnode.val;
        node.next=newnode.next;
        
    }
}
