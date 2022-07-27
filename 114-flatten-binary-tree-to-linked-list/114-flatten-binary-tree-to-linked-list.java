/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
        if(root==null)return;
        flatten(root.left);
        TreeNode righty=root.right;
        root.right=root.left;
        root.left=null;
        flatten(righty);
        TreeNode temp=root;
        while(temp.right!=null){
            temp=temp.right;
        }
        temp.right=righty;
    }
}