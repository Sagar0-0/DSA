class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
	//  Your code here	
	    Node[] arr=dfs(root);
	    return arr[0];
    }
    Node[] dfs(Node root){
        if(root.left==null && root.right==null){
            return new Node[]{root,root};
        }
        
        if(root.left==null){
            Node[] righty=dfs(root.right);
            root.right=righty[0];// 10 -> 36
            righty[0].left=root;// 10 <- 36
            return new Node[]{root,righty[1]};//10,15
        }
        
        Node[] lefty=dfs(root.left);
        lefty[1].right=root;//30 -> 10
        root.left=lefty[1];// 30 <-10
        
        if(root.right==null){
            return new Node[]{lefty[0],root};//25,10
        }
        Node[] righty=dfs(root.right);
        root.right=righty[0];// 10 -> 36
        righty[0].left=root;// 10 <- 36
        
        return new Node[]{lefty[0],righty[1]};//25,15
    }
}
