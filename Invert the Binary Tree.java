public class Solution {
    public TreeNode invertTree(TreeNode A) {
        if(A==null)return null;
        TreeNode le=null;
        if(A.left!=null){
            le=invertTree(A.left);
        }
        TreeNode ri=null;
        if(A.right!=null){
            ri=invertTree(A.right);
        }
        A.left=ri;
        A.right=le;
        return A;
    }
}
