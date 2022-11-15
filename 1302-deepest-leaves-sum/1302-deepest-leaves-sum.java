class Solution {
    int deepestLevel = 0;
    int sum;
    
    public int deepestLeavesSum(TreeNode root) {
        deepestLeavesSum(root, 0);
        return sum;
    }
    
    public void deepestLeavesSum(TreeNode root,int level) {
        if (root == null) {
            return;
        }
        
        if (root.left == null && root.right == null && level == deepestLevel) {
            sum = sum + root.val;
        }
        
        if (root.left == null && root.right == null && level > deepestLevel) {
            deepestLevel = level;
            sum = root.val;
        }
        
        deepestLeavesSum(root.left, level + 1);
        deepestLeavesSum(root.right, level + 1);
    }
}