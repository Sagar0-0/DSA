class Solution {
    TreeNode prev = null;
    TreeNode first = null;
    TreeNode second = null;
    public void recoverTree(TreeNode root) {
        inorder(root);
        swap(first,second);
    }
    public void swap(TreeNode a, TreeNode b) {
        int temp = a.val;
        a.val=b.val;
        b.val=temp;
    }
    public void inorder(TreeNode root) {
        if(root!=null) {
            if(root.left!=null) {
                inorder(root.left);
            }
            if(prev!=null && prev.val>root.val) {
                if(first==null) {
                    first=prev;
                } 
                if(first!=null) {
                    second=root;
                }
            }
            prev=root;
            if(root.right!=null) {
                inorder(root.right);
            }
        }
    }
}