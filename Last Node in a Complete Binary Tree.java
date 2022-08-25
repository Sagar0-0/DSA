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
    public int lastNode(TreeNode A) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(A);
        int val=-1;
        while(q.size()>0){
            int sz=q.size();
            while(sz-->0){
                TreeNode node=q.remove();
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
                val=node.val;
            }
        }
        return val;
    }
}
