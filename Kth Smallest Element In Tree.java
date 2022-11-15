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
    static int count, result;
    public int kthsmallest(TreeNode root, int B) {
        count = 0;
        result = Integer.MIN_VALUE;
        inorder(root,B);
        return result;
    }
    public static void inorder(TreeNode root,int k){
        if(root == null){
            return;
        }
        inorder(root.left,k);
        count++;
        if(count == k){
            result = root.val;
            return;
        }
        inorder(root.right,k);
    }
}

