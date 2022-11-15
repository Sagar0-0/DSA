First Approach:

Time Complexity:O(N)
Auxiliary Space:O(N)
  
  
Code:


class Solution {
    public static Node moveToFront(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        
        ArrayList<Integer>aa=new ArrayList<Integer>();
        Node temp=head;
        while(temp!=null){
            aa.add(temp.data);
            temp=temp.next;
        }
        int a=aa.get(aa.size()-1);
        aa.remove(aa.size()-1);
        aa.add(0,a);
        Node temp2=new Node(-1);
        Node temp3=temp2;
        
       for(int a1:aa){
           temp2.next=new Node(a1);
           temp2=temp2.next;
       }
       
       return temp3.next;
        
    }
}




=======================================================================================================================================================================
  

Second Approach:

Time Complexity:O(N)
Auxiliary Space:O(1)
  

Code:

class Solution {
    public static Node moveToFront(Node head) {
       if(head==null){
           return null;
       }
       else if(head.next==null){
           return head;
       }
        Node temp=head;
        Node prev=null;
        Node current=head;
        while(current.next!=null){
            prev=current;
            current=current.next;
        }
        current.next=head;
        prev.next=null;
        return current;
    }
}
     





