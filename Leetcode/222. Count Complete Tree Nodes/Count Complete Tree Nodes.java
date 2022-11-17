class Solution {
    int count = 0;
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        countNodes(root.left);
        count++;
        System.out.print(root.val+" ");
        countNodes(root.right);
        return count;
    }
}
