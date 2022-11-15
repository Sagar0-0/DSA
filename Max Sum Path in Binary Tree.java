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
    Map<TreeNode,Integer> map;
    public int maxPathSum(TreeNode A) {
        if(A==null)return 0;
        map=new HashMap<>();
        return dfs(A);
    }
    int dfs(TreeNode A){
        if(A==null)
            return Integer.MIN_VALUE;
        int s=A.val;
        if(A.left!=null && sum(A.left)>0)
            s=s+sum(A.left);
        if(A.right!=null && sum(A.right)>0)
            s=s+sum(A.right);
        return max(s,dfs(A.left),dfs(A.right));
    }
    int max(int a,int b,int c){
        return (a>b&&a>c?a:(b>c?b:c));
    }
    int sum(TreeNode A){
        if(A==null)
            return 0;
        if(map.containsKey(A))return map.get(A);
        int ans=A.val+Math.max(sum(A.left),sum(A.right));
        map.put(A,ans);
        return ans;
    }
}
