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
