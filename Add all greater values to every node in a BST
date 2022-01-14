class Solution{
    
    // modify the BST and return its root
    public Node modify(Node root){
        //Write your code here
        mod(root,0);
        return root;
    }
    public void mod(Node node,int increment){
        if(node!=null){
            node.data=node.data+sum(node.right)+increment;
            mod(node.right,increment);
            mod(node.left,node.data);
        }        
    }
    public int sum(Node node){
        if(node==null)return 0;
        return node.data+sum(node.left)+sum(node.right);
    }
    
}
