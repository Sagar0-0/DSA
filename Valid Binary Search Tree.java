public class Solution {
    int check(TreeNode a,int min,int max){
        if(a==null)return 1;
        if(a.val<min || a.val>max)return 0;
        return check(a.left,min,a.val-1)& check(a.right,a.val+1,max);
    }
    public int isValidBST(TreeNode root) {
        return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}
