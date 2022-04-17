class Solution {
    public TreeNode increasingBST(TreeNode root){
        List<Integer> list=new ArrayList<>();
        inOrder(root,list);
        TreeNode newHead=new TreeNode(-1);
        TreeNode temp=newHead;
        for(int i=0;i<list.size();i++){
            temp.right=new TreeNode(list.get(i));
            temp=temp.right;
        }
        return newHead.right;
    }
    public void inOrder(TreeNode root,List<Integer> list){
        if(root==null)return;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
}