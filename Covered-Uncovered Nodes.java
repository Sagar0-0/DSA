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
    public Long coveredNodes(TreeNode A) {
        Long cov=0l;
        Long un=0l;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(A);
        while(q.size()>0){
            int sz=q.size();
            for(int i=0;i<sz;i++){
                TreeNode curr=q.remove();
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
                if(i==0 || i==sz-1){
                    un+=curr.val;
                }else{
                    cov+=curr.val;
                }
            }
        }
        return (Long)Math.abs(un-cov);
    }
}
