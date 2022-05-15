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
    int res;
    int depth;
    public int deepestLeavesSum(TreeNode root) {
        depth=findDepth(root);
        preOrder(root,1);
        return res;
    }
    public void preOrder(TreeNode root,int lvl){
        if(root==null)return;
        if(lvl==depth){
            res+=root.val;
            return;
        }
        preOrder(root.left,lvl+1);
        preOrder(root.right,lvl+1);
    }
    public int findDepth(TreeNode root){
        if(root==null)return 0;
        int lefty=findDepth(root.left);
        int righty=findDepth(root.right);
        return Math.max(lefty,righty)+1;
    }
}