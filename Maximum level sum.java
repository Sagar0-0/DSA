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
    public int solve(TreeNode A) {
        int sum=A.val;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(A);
        while(!q.isEmpty()){
            int sz=q.size();
            int curr=0;
            for(int i=0;i<sz;i++){
                TreeNode node=q.remove();
                curr+=node.val;
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            sum=Math.max(sum,curr);
        }
        return sum;
    }
}
