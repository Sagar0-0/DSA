class GfG
{
    Node flatten(Node root)
    {
	// Your code here
	   Node nexty=root.next;
	   while(nexty!=null){
	       Node second=nexty;
	       nexty=nexty.next;
	       second.next=null;
	       root=merge(root,second);
	   }
	   return root;
    }
    Node merge(Node l1,Node l2){
        Node head=new Node(0);
        Node curr=head;
        while(l1!=null && l2!=null){
            if(l1.data<=l2.data){
                curr.bottom=l1;
                l1=l1.bottom;
            }else{
                curr.bottom=l2;
                l2=l2.bottom;
            }
            curr=curr.bottom;
        }
        
        if(l1!=null)curr.bottom=l1;
        if(l2!=null)curr.bottom=l2;
        
        return head.bottom;
    }
}
