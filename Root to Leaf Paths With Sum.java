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
    ArrayList<ArrayList<Integer>> ans;
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        ans=new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();
        curr.add(A.val);
        dfs(A,B,curr,A.val);
        return ans;
    }
    public void dfs(TreeNode a,int b,ArrayList<Integer> list,int curr){
        if(a.left==null && a.right==null){
            if(curr==b){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        
        if(a.left!=null){
            list.add(a.left.val);
            curr+=a.left.val;
            dfs(a.left,b,list,curr);
            curr-=a.left.val;
            list.remove(list.size()-1);
        }
        
        if(a.right!=null){
            list.add(a.right.val);
            curr+=a.right.val;
            dfs(a.right,b,list,curr);
            curr-=a.right.val;
            list.remove(list.size()-1);
        }
    }
}
