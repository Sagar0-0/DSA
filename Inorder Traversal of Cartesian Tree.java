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
    public TreeNode buildTree(int[] A) {
        return dfs(A,0,A.length-1);
    }
    TreeNode dfs(int[]a,int i,int j){
        if(i>j)return null;
        int temp=i;
        int max=Integer.MIN_VALUE;
        int idx=0;
        while(temp<=j){
            if(a[temp]>max){
                max=a[temp];
                idx=temp;
            }
            temp++;
        }
        TreeNode node=new TreeNode(a[idx]);
        node.left=dfs(a,i,idx-1);
        node.right=dfs(a,idx+1,j);
        return node;
    }
}
