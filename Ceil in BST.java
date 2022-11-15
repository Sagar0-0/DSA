class Tree {
    int ans;
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        // Code here
        ans=Integer.MAX_VALUE;
        dfs(root,key);
        return ans;
    }
    void dfs(Node root,int key){
        if(root==null)return;
        if(root.data==key){
            ans=key;
        }else if(root.data>key){
            if(root.data<ans){
                ans=root.data;
            }
            dfs(root.left,key);
        }else{
            dfs(root.right,key);
        }
    }
}
