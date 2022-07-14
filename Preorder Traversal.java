/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    ArrayList<Integer> ans;
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ans=new ArrayList<>();
        pre(A);
        return ans;
    }
    void pre(TreeNode root){
        if(root==null)return;
        ans.add(root.val);
        pre(root.left);
        pre(root.right);
    }
    
}
