public class Solution {
    public int isSameTree(TreeNode A, TreeNode B) {
        if(equal(A,B)){
            return 1;
        }else{
            return 0;
        }
    }
    public boolean equal(TreeNode a,TreeNode b){
        if(a==null && b==null)return true;
        if((a==null && b!=null) || (a!=null && b==null))return false;
        if(a.val!=b.val)return false;
        return equal(a.left,b.left) && equal(a.right,b.right);
    }
}
