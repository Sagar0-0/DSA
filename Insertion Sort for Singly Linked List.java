class Solution
{
    public static Node insertionSort(Node head){
        Node newHead=new Node(-1);
        Node temp=head;
        while(temp!=null){
            Node newtemp=newHead;
            Node toAdd=temp;
            temp=temp.next;
            toAdd.next=null;
            if(newtemp.next==null){
                newtemp.next=toAdd;
            }else{
                while(newtemp!=null){
                    if(newtemp.next==null){
                        break;
                    }
                    if(newtemp.next.data<toAdd.data){
                        newtemp=newtemp.next;
                    }else{
                        break;
                    }
                }
                Node nexxt=newtemp.next;
                newtemp.next=toAdd;
                toAdd.next=nexxt;
            }
        }
        return newHead.next;
    }
}
