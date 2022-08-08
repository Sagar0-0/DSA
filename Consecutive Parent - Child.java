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
    public int consecutiveNodes(TreeNode A) {
        if(A.left==null && A.right==null)return 0;
        int ans=0;
        if(A.left!=null){
            if(A.left.val==A.val-1 || A.left.val==A.val+1)ans++;
            ans+=consecutiveNodes(A.left);
        }
        if(A.right!=null){
            if(A.right.val==A.val-1 || A.right.val==A.val+1)ans++;
            ans+=consecutiveNodes(A.right);
        }
        return ans;
    }
}
