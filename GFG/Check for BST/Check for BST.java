public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root, int minValue, int maxValue) {
        if(root==null) return true;
        if(root.data<=minValue || root.data>=maxValue) return false;
        return isBST(root.left,minValue,root.data)&&isBST(root.right,root.data,maxValue);
    }
    boolean isBST(Node root)
    {
        // code here.
        return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}
