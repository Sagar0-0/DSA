/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public TreeNode sortedListToBST(ListNode a) {
        return dfs(a);
	}
    public TreeNode dfs(ListNode a){
        if(a.next==null)return new TreeNode(a.val);
        ListNode prev=null;
        ListNode slow=a;
        ListNode fast=a;
        while(fast.next!=null && fast.next.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev!=null)prev.next=null;
        ListNode next=slow.next;
        slow.next=null;
        TreeNode root=new TreeNode(slow.val);
        if(!slow.equals(a))root.left=dfs(a);
        root.right=dfs(next);
        return root;
    }
}
