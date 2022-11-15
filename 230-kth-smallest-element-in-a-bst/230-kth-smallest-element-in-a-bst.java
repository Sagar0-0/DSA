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
    int count=0;
    int ans=-1;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        return ans;
    }
    public void dfs(TreeNode root,int k){
        if(root==null)return;
        dfs(root.left,k);
        count++;
        if(count==k){
            ans=root.val;
            return;
        }
        dfs(root.right,k);
        return;
    }
}