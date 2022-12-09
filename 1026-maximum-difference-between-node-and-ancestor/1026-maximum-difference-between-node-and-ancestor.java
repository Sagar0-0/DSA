class Solution {
   int maxDifference = 0;
    public int maxAncestorDiff(TreeNode root) {
         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
        dfs(root, max, min);
        return maxDifference;
    }
    
   void dfs(TreeNode root, int max, int min){
        if(root == null) return;
        
        if(root.val < min) {
            min = root.val;
            
            }
        if(root.val > max) {
            max = root.val;
            };
        
        if(Math.abs(min - max) > maxDifference) {
            maxDifference = Math.abs(min - max);
        }
         dfs(root.left, max, min);
         dfs(root.right, max, min);
    }
}