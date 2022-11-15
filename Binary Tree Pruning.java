class Solution {
    public TreeNode pruneTree(TreeNode root) {
        make(root);    //In this function checked all childs of root, whether they contain root node 1 as sub tree, if does not exist removed the node
        if(root.left==null && root.right==null && root.val==0) return null;   // This is the case when only single node present and it is 0 In that case we should return null
        return root;
    }
    public boolean make(TreeNode root) {
        if(root==null) return false;
        
        boolean left=make(root.left);
        boolean right=make(root.right);
        
        if(left==false) {
            if(root.left!=null) root.left=null;
        }
        
        if(right==false) {
            if(root.right!=null) root.right=null;
        }
        
        if(left==true || right==true) return true;
        
        if(root.val==1) return true;
        
        return false;
    }
}
