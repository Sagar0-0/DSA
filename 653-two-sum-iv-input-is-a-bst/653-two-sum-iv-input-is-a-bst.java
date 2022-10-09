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
    boolean flag;
    Set<Integer> set;
    public boolean findTarget(TreeNode root, int k) {
        set=new HashSet<>();
        flag=false;
        dfs(root,k);
        return flag;
    }
    void dfs(TreeNode root,int k){
        if(root==null)return;
        if(set.contains(k-root.val)){
            flag=true;
            return;
        }
        set.add(root.val);
        dfs(root.left,k);
        dfs(root.right,k);
    }
}