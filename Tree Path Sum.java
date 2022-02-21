public class Solution {
    public int hasPathSum(TreeNode A, int B) {
        if(A==null) return 0;
        if(A.val==B && A.left==null && A.right==null) return 1;
        if(hasPathSum(A.left,B-A.val)==1) return 1;
        return hasPathSum(A.right,B-A.val);
    }
}
