class Tree{
    // return the head of the DLL and remove those node from the tree as well.
    public Node convertToDLL(Node root)
   {
       // Code here
          if(root==null)
            return null;
       ArrayList<Node> al=new ArrayList<>();
       solve(root,al);
       Node head=al.get(0);
       Node prev=al.get(0);
       for(int i=1;i<al.size();i++)
       {
           Node curr=al.get(i);
           prev.right=curr;
           curr.left=prev;
           prev=curr;
       }
       prev.right=null;
       head.left=null;
       return head;
   }
    static Node solve(Node root,ArrayList<Node> al)
   {
       if(root==null)
       return null;
       
       if(root.right==null && root.left==null)
       {
           al.add(root);
           return null;
       }
       root.left=solve(root.left,al);
       root.right=solve(root.right,al);
       return root;
   }
   
    
}
