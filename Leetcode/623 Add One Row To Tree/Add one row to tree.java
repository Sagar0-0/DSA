class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1) { // if depth is 1 we have to add for root
            TreeNode newH=new TreeNode(val);
            newH.left=root;
            return newH;
        }
        addRow(root, val, 1, depth-1); //starting with root starting from 1 to depth-1
        return root;
    }
    public void addRow(TreeNode root, int val, int height, int expHeight) {
        if(root==null) {
            return ;
        }
        if(expHeight==height) {
            TreeNode left=new TreeNode(val, root.left, null);
            TreeNode right=new TreeNode(val, null, root.right);
            root.left=left;
            root.right=right;
            return ;
        }
        
        addRow(root.left, val, height+1, expHeight);
        addRow(root.right, val, height+1, expHeight);

    }
}
