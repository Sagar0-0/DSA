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
    String sb;
    public String tree2str(TreeNode root) {
        sb=new String();
        dfs(root);
        return sb;
    }
    public void dfs(TreeNode root){
        if(root==null)return;
        sb+=root.val;
        if(root.left==null && root.right==null)return;
        sb+="(";
        dfs(root.left);
        sb+=")";  
        if(root.right!=null){
            sb+="(";
            dfs(root.right);
            sb+=")";
        }
    }
}