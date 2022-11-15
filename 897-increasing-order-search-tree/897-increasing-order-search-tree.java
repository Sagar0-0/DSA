class Solution {
    public TreeNode increasingBST(TreeNode root){
        List<TreeNode> list=new ArrayList<>();
        inOrder(root,list);
        TreeNode newHead=new TreeNode(-1);
        TreeNode temp=newHead;
        for(int i=0;i<list.size();i++){
            temp.right=list.get(i);
            temp=temp.right;
        }
        return newHead.right;
    }
    public void inOrder(TreeNode root,List<TreeNode> list){
        if(root==null)return;
        TreeNode lefty=root.left;
        root.left=null;
        TreeNode righty=root.right;
        root.right=null;
        inOrder(lefty,list);
        list.add(root);
        inOrder(righty,list);
    }
}