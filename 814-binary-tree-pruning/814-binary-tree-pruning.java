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
    Map<TreeNode,Integer>map;
    boolean del;
    public TreeNode pruneTree(TreeNode root) {
        map=new HashMap<>();
        int sum=root.val+sum(root.right)+sum(root.left);
        if(sum==0){
            return null;
        }
        dfs(root);
        return root;
    }
    void dfs(TreeNode root){
        if(root==null)return;
        if(sum(root.left)==0){
            root.left=null;
        }
        if(sum(root.right)==0){
            root.right=null;
        }
        dfs(root.left);
        dfs(root.right);
    }
    int sum(TreeNode root){
        if(root==null)return 0;
        if(map.containsKey(root))return map.get(root);
        int sum=root.val+sum(root.left)+sum(root.right);
        map.putIfAbsent(root,sum);
        return sum;
    }
    
}


Approach-2 BY @Jay-Thesia

class Solution {
    public TreeNode pruneTree(TreeNode root) {
        
        return helper(root)?null:root;
    }
    
    public boolean helper(TreeNode root){
        
        if(root==null)
            return true;
        
        boolean left=helper(root.left);
        boolean right=helper(root.right);
        
        if(left)
            root.left=null;
        if(right)
            root.right=null;
        
        return root.val==0 && left && right;
    }
}
