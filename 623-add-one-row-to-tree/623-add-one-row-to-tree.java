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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode head=new TreeNode(val);
            head.left=root;
            return head;
        }
        dfs(root,val,depth-1);
        return root;
    }
    public void dfs(TreeNode root,int val,int depth){
        if(depth==1){
            TreeNode lefty=root.left;
            TreeNode righty=root.right;
            TreeNode newLeft=new TreeNode(val);
            TreeNode newRight=new TreeNode(val);
            newLeft.left=lefty;
            root.left=newLeft;
            newRight.right=righty;
            root.right=newRight;
            return;
        }
        if(root.left!=null)dfs(root.left,val,depth-1);
        if(root.right!=null)dfs(root.right,val,depth-1);
    }
}