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
    int i=0;
    public TreeNode constructBST(int[] A) {
        return bstFromPreOrder(A,Integer.MAX_VALUE);
    }
    
    public TreeNode bstFromPreOrder(int[] preorder ,int bound){
        if(i== preorder.length || preorder[i]>=bound) return null;
        TreeNode root = new TreeNode(preorder[i++]);
        root.left = bstFromPreOrder(preorder, root.val);
        root.right = bstFromPreOrder(preorder, bound);
        return root;
    }
}

                                                                       



