class Solution {
    StringBuilder sb=new StringBuilder();
    public String tree2str(TreeNode root) {
        str(root);
        return sb.toString();
    }
    public void str(TreeNode root) {
        if(root==null) {
            return ;
        }  
        if(root.left==null && root.right==null) { //when there is no childs, adding just node value
            sb.append(""+root.val);
            return ;
        }
        
        sb.append(""+root.val+"(");
        str(root.left); //irrespective of left child present or not we should add ()-> so calling left child
        sb.append(")");
        if(root.right!=null) {  //If right child not present no need to add any ()
            sb.append("(");
            str(root.right);
            sb.append(")");
        }
    }
}
