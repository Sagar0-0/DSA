class Solution {
    TreeNode res = null; 
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        helper(root, p, q);
        return res; 
    }
    boolean helper(TreeNode root, TreeNode p, TreeNode q) { 
        if(root == null) return false; 
        int curr = root == p || root == q ? 1 : 0; 
        int left = helper(root.left, p, q) ? 1 : 0;
        int right = helper(root.right, p, q) ? 1 : 0; 
        int sum = right + left + curr; 
        if(sum == 2) res = root;
        return sum == 1;
    }
}