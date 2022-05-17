/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans;
    TreeNode tar;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        tar=target;
        dfs(original,cloned);
        return ans;
    }
    public void dfs(TreeNode a,TreeNode b){
        if(a==null)return;
        if(a==tar){
            ans=b;
            return;
        }
        dfs(a.left,b.left);
        dfs(a.right,b.right);
    }
}