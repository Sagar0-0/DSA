class Solution{
    public void toSumTree(Node root){
         //add code here.
         dfs(root);
    }
    int dfs(Node root){
        if(root==null)return 0;
        int val = root.data;
        int lefty=dfs(root.left);
        int righty=dfs(root.right);
        root.data=lefty+righty;
        return val + lefty + righty;
    }
}
