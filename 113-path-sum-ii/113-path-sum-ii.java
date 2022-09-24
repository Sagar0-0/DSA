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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        dfs(0,list,ans,targetSum,root);
        return ans;
    }
    void dfs(int currSum,List<Integer> list,List<List<Integer>> ans,int target,TreeNode root){
        if(root==null)return;
        if(root.left==null && root.right==null){
            list.add(root.val);
            currSum+=root.val;
            if(currSum==target && list.size()>0){
                ans.add(new ArrayList<>(list));
            }
            list.remove(list.size()-1);
            currSum-=root.val;
            return;
        }
        list.add(root.val);
        currSum+=root.val;
        if(root.left!=null)dfs(currSum,list,ans,target,root.left);
        if(root.right!=null)dfs(currSum,list,ans,target,root.right);
        list.remove(list.size()-1);
        currSum-=root.val;
    }
}