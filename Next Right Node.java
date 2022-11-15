class Solution{
	Node nextRight(Node root, int key)
    {
		//Write your code here
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		boolean found=false;
		while(q.size()>0){
		    int sz=q.size();
		    //level
		    while(sz-->0){
		        Node node=q.remove();
		        if(found)return node;
		        if(node.data==key)found=true;
		        if(node.left!=null)q.add(node.left);
		        if(node.right!=null)q.add(node.right);
		    }
		    if(found)return new Node(-1);
		}
		return null;
    }
}

