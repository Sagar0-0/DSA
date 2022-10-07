class Solution
{
    static Node curr;
    public static void flatten(Node root)
    {
        //code here
        curr=new Node(-1);
        dfs(root);
    }
    static void dfs(Node root){
        if(root==null)return;
        Node leftSubtree=root.left;
        root.left=null;
        Node rightSubtree=root.right;
        root.right=null;
        
        curr.right=root;
        curr=curr.right;
        
        dfs(leftSubtree);
        dfs(rightSubtree);
        
    }
}
