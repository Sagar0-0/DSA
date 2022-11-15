class Solution {
    public int countNodes(TreeNode root) {
        if(root ==  null){
            return 0;
        }
        int leftDep=1;
        TreeNode leftNode = root.left;
        while(leftNode != null){
            leftDep++;
            leftNode = leftNode.left;
        }
        int rightDep = 1;
        TreeNode rightNode = root.right;
        while(rightNode != null){
            rightDep++;
            rightNode = rightNode.right;
        }
        if(leftDep == rightDep){
            return (int)Math.pow(2,leftDep)-1;
        }
        return countNodes(root.left)+countNodes(root.right)+1;
    }
}