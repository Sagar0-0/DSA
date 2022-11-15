class Solution {
    private int NOT_MONITORED = 0;
    private int MONITORED_NOCAM = 1;
    private int MONITORED_WITHCAM = 2;
    private int cameras = 0;
    
    public int minCameraCover(TreeNode root) {
        int top = dfs(root);
        return top == NOT_MONITORED ? cameras+1 :cameras;
    }
    
    private int dfs (TreeNode root){
        if(root == null)return MONITORED_NOCAM;
        int left = dfs(root.left);
        int right = dfs(root.right);
        
        if (left == MONITORED_NOCAM && right == MONITORED_NOCAM) {
            return NOT_MONITORED;
        } else if (left == NOT_MONITORED || right == NOT_MONITORED) {
            cameras++;
            return MONITORED_WITHCAM;
        } else {
            return MONITORED_NOCAM;
        }
    }
}