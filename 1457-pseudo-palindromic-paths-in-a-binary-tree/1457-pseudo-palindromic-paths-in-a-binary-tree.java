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
    int ans;
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] freq=new int[10];
        ans=0;
        dfs(root,freq);
        return ans;
    }
    void dfs(TreeNode root,int[]freq){
        if(root.left==null && root.right==null){
            freq[root.val]++;
            boolean odd=false;
            for(int i=0;i<10;i++){
                if(freq[i]%2!=0){
                    if(!odd){
                        odd=true;
                    }else{
                        freq[root.val]--;
                        return;
                    }
                }
            }
            ans++;
            freq[root.val]--;
            return;
        }
        freq[root.val]++;
        if(root.left!=null)dfs(root.left,freq);
        if(root.right!=null)dfs(root.right,freq);
        freq[root.val]--;
    }
}