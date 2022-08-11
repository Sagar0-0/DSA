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
    public boolean isValidBST(TreeNode root) {
        return dfs(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean dfs(TreeNode root,long lower,long upper){
        if(root==null)return true;
        if(root.val<=lower || root.val>=upper)return false;
        return dfs(root.left,lower,root.val) && dfs(root.right,root.val,upper);
    }
}