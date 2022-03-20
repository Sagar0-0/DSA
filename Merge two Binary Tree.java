public class Solution {
    public TreeNode solve(TreeNode A, TreeNode B) {
        if(A==null && B==null)return null;
        if(A==null){
            return B;
        }
        if(B==null){
            return A;
        }
        TreeNode node=new TreeNode(A.val+B.val);
        TreeNode lefty=solve(A.left,B.left);
        TreeNode righty=solve(A.right,B.right);
        node.left=lefty;
        node.right=righty;
        return node;
    }
}
