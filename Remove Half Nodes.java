public class Solution {
    public TreeNode solve(TreeNode A) {
        if(A==null)return A;
        if(A.left!=null && A.right!=null){
            A.left=solve(A.left);
            A.right=solve(A.right);
        }else if(A.left!=null){
            A=solve(A.left);
        }else if(A.right!=null){
            A=solve(A.right);
        }
        return A;
    }
}
