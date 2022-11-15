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
    public int minDepth(TreeNode A) {
        if(A==null)return Integer.MAX_VALUE;
        int x=Math.min(minDepth(A.left),minDepth(A.right));
        if(x==Integer.MAX_VALUE)return 1;
        return 1+x;
    }
}
