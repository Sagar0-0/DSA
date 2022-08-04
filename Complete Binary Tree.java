class GfG
{
	boolean isCompleteBT(Node root)
    {
          //add code here.
          Queue<Node> q=new LinkedList<>();
          q.add(root);
        boolean foundNull=false;
          while(!q.isEmpty()){
              int sz=q.size();
              while(sz-->0){
                Node node=q.remove();
                if(node==null){
                    foundNull=true;
                }else{
                    if(foundNull){
                        return false;
                    }else{
                        q.add(node.left);
                        q.add(node.right);
                    }
                }
              }
          }
          return true;
	} 
}
