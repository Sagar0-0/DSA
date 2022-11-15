public static Node post_order(int pre[], int size) 
{
    //Your code here
    Node root=new Node(pre[0]);
    for(int i=1;i<size;i++){
        root=dfs(pre[i],root);
    }
    return root;
} 
static Node dfs(int key,Node head){
    if(head==null){
        Node node=new Node(key);
        return node;
    }
    if(key<head.data){
        head.left=dfs(key,head.left);
    }else{
        head.right=dfs(key,head.right);
    }
    return head;
}
