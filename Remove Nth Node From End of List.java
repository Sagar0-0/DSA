
//Brute force solution
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
     
        if(head==null)
            return null;
        
        if(head.next==null)
            return null;
        
        ListNode temp = head;
        int count=0;
        
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        
        int pos = count-n;
        
        ListNode ptr = head;
        
        if(pos==0){
            head = head.next;
        }
        
        for(int i=1; i<pos && ptr.next!=null; i++){  // i<pos bcoz starting already points to first node so.
            ptr = ptr.next;
        }
        
        if(ptr.next.next!=null){
            ptr.next = ptr.next.next;
        }
        else
            ptr.next=null;
        
        return head;
    }
  
  
  //Optimize using two pointer approace
  class Solution {
    
         public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null)
            return null;
        if(head.next==null)
            return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        
        //for maintaing gap
        for(int i=1; i<=n; i++)
            fast = fast.next;
        
        if(fast==null)
            return head.next;
       
        
        while(fast.next!=null){
            slow = slow.next;
            fast=fast.next;
        }
        
        
        slow.next = slow.next.next;
        
        return head;
        
    }
  }
  
  
