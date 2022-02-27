class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        root.val=0;
        q.add(root);
        return bfs(q);
    }
    
    public int bfs(Queue<TreeNode> q){
        int maxWidth = 1;
        while(!q.isEmpty()){
            int sz=q.size();
            int left = q.peek().val;
            int right = left;
            for(int i=0;i<sz;i++){
                TreeNode node=q.remove();
                if(node.left!=null){
                    node.left.val = node.val * 2 - 1;
                    q.add(node.left);
                }
                if(node.right!=null){
                    node.right.val = node.val * 2;
                    q.add(node.right);
                }
                if(i==sz-1)
                    right=node.val;
            }
            maxWidth=Math.max(maxWidth,right-left+1);
        }
        return maxWidth;
    }
}
