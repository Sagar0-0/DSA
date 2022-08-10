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
    int sum;
    public void dfs(TreeNode a,int num){
        if(a==null)return;
        num=(num*10 + a.val)%1003;
        if(a.left==null && a.right==null){
            sum=(sum+num);
            return;
        }
        dfs(a.left,num);
        dfs(a.right,num);
        return;
    }
    public int sumNumbers(TreeNode A) {
        sum=0;
        int curr=0;
        dfs(A,curr);
        return sum%1003;
    }
    
}
