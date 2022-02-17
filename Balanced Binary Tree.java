public class Solution {
    public int isBalanced(TreeNode A) {
        if(A==null)
            return 1;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(A);
        while(!queue.isEmpty()){
            TreeNode current=queue.remove();
            if(Math.abs(getHeight(current.left)-getHeight(current.right))>1)
                return 0;

            if(current.left!=null)
                queue.add(current.left);
            if(current.right!=null)
                queue.add(current.right);
        }
    return 1;        
}


    int getHeight(TreeNode root){
        if(root==null)
            return -1;
        else
            return 1+Math.max(getHeight(root.left),getHeight(root.right));
    }
}
