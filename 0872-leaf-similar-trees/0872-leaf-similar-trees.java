class Solution {
 
    public static void preorder(TreeNode root,ArrayList<Integer> li)
    {
        if(root.left==null && root.right==null)li.add(root.val);
        if(root.left!=null)
        {
            preorder(root.left,li);
        }
        if(root.right!=null)
        {
            preorder(root.right,li);
        }
    } 
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
      ArrayList<Integer> one=new ArrayList<>();
    ArrayList<Integer> two=new ArrayList<>();
        preorder(root1,one);
        preorder(root2,two);
        return one.equals(two);
    }
}