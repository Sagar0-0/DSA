/*
  This code is contributed by:- Pulkit Malhotra (https://github.com/PulkitMalhotra161001)
*/

class Solution
{
    static int ans;
    static int NumberOfTurns(Node root, int first, int second)
    {
        //your code here
        ans=0;
        Node lca=findLCA(root,first,second);
        boolean left=true;
        if(lca.data==first){
            findCount(lca.left,left,second);
            findCount(lca.right,!left,second);
        }else if(lca.data==second){
            findCount(lca.left,left,first);
            findCount(lca.right,!left,first);
        }else{
            findCount(lca.left,left,first);
            findCount(lca.right,!left,first);
            findCount(lca.left,left,second);
            findCount(lca.right,!left,second);
            return ans+1;
        }
        return ans;
    }
    
    static boolean findCount(Node node,boolean left,int key){
        if(node==null)return false;
        if(node.data==key)return true;
        
        if(left){
            if(findCount(node.left,left,key)){
                return true;
            }
            if(findCount(node.right,!left,key)){
                ans++;
                return true;
            }
        }else{
            if(findCount(node.right,left,key)){
                return true;
            }
            if(findCount(node.left,!left,key)){
                ans++;
                return true;
            }
        }
        return false;
    }
    
    static Node findLCA(Node root,int first,int second){
        if(root==null)return null;
        if(root.data==first || root.data==second){
            return root;
        }
        
        Node left_lca=findLCA(root.left,first,second);
        Node right_lca=findLCA(root.right,first,second);
        if(left_lca!=null && right_lca!=null){
            return root;
        }else{
            return left_lca==null?right_lca:left_lca;
        }
    }
}




//Easy to understand code without repetition of similar cases

class Solution
{
    static int ans;
    static int NumberOfTurns(Node root, int first, int second)
    {
        ans=0;
        Node lca=lca(root,first,second);
        if(lca.data==first){
            solve(lca,second,null);
            return ans;
        }else if(lca.data==second){
            solve(lca,first,null);
            return ans;
        }
        solve(lca,first,null);
        solve(lca,second,null);
        return ans+1;
    }

    static boolean solve(Node root,int x,Boolean left){
        if(root==null)  return false;
        if(root.data==x)     return true;
        
        if(left==null){
            solve(root.left,x,true);
            solve(root.right,x,false);
            return true;
        }else if(left){
            if(solve(root.left,x,true)){
                return true;
            }
            if(solve(root.right,x,false)){
                ans++;
                return true;
            }
        }else{
            if(solve(root.right,x,false)){
                return true;
            }if( solve(root.left,x,true) ){
                ans++;
                return true;
            }
        }
        
        return false;
    }
    static Node lca(Node root, int n1,int n2)
	{
	    if(root==null)  return root;
	    if(root.data==n1 || root.data==n2)    return root;
	    
	    Node left=lca(root.left,n1,n2);
	    Node right=lca(root.right,n1,n2);
	    
	    if(left!=null && right!=null){
	        return root;
	    }
	    
	    return left==null?right:left;
	}
}
