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
    public TreeNode sortedArrayToBST(int[] nums) {
        return create(nums,0,nums.length-1);
    }
    TreeNode create(int[]nums,int i,int j){
        if(j<i)return null;
        int mid=i+(j-i)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=create(nums,i,mid-1);
        node.right=create(nums,mid+1,j);
        return node;
    }
}