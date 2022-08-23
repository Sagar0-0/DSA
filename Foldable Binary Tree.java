class Tree
{
    //Function to check whether a binary tree is foldable or not.
    boolean IsFoldable(Node node) 
	{ 
		// your code
		if(node==null)return true;
		return dfs(node.left,node.right);
	} 
	boolean dfs(Node a,Node b){
	    if(a==null && b==null)return true;
	    if(a==null || b==null)return false;
	    return dfs(a.left,b.right) && dfs(a.right,b.left);
	}
}
