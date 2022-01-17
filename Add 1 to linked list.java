class Solution
{
    public static Node addOne(Node head) 
    { 
        //code here.
        Node newHead=reverse(head);
        Node list=newHead;
        while(list!=null){
            if(list.data<9){
                list.data++;
                break;
            }else{
                if(list.next==null){
                    list.next=new Node(0);
                }
                list.data=0;
                list=list.next;
            }
        }
        return reverse(newHead);
        
    }
    public static Node reverse(Node head){
        Node cur=head;
        Node prev=null;
        while(cur!=null){
            Node temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
}
