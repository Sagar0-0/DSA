class Solution
{
    public static int maxPathSum(Node root)
    {
        //code here
        if(root==null)return 0;
        return Math.max(maxPathSum(root.left),maxPathSum(root.right))+root.data;
    }
}
