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
    
    int count;
    public int goodNodes(TreeNode root) {
        
        if(root.left==null && root.right==null ){
            return 1;
        }
        
        count=0;
        int curr=root.val;
        
        helper(root,curr);
            
        return count;
    }
    
    public void helper(TreeNode root,int curr){
        
        if(root==null)
            return;
        
        if(root.val>=curr){
            count++;
            curr=root.val;
        }
        
        helper(root.left,curr);
        helper(root.right,curr);
    }
}