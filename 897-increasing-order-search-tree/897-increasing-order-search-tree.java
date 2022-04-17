class Solution {
    public TreeNode increasingBST(TreeNode root){
        List<Integer> list=new ArrayList<>();
        preOrder(root,list);
        TreeNode newHead=new TreeNode(-1);
        TreeNode temp=newHead;
        for(int i=0;i<list.size();i++){
            temp.right=new TreeNode(list.get(i));
            temp=temp.right;
        }
        return newHead.right;
    }
    public void preOrder(TreeNode root,List<Integer> list){
        if(root==null)return;
        preOrder(root.left,list);
        list.add(root.val);
        preOrder(root.right,list);
    }
}