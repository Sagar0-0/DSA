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
    public TreeNode convertBST(TreeNode root) {
        if(root==null)return null;
        root.val+=sum(root.right);
        convertBST(root.right);
        convertBST(root.left);
        add(root.left,root.val);
        return root;
    }
    public void add(TreeNode root,int sum){
        if(root==null)return;
        root.val+=sum;
        add(root.left,sum);
        add(root.right,sum);
    }
    public int sum(TreeNode root){
        if(root==null)return 0;
        int s=root.val;
        s+=sum(root.right);
        s+=sum(root.left);
        return s;
    }
}