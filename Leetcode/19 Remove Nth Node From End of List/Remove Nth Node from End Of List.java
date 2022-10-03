Solution 1:

Using ArrayList as additional Space
Time: 2ms 
Space: 42.3Mb


ArrayList<Integer>aa=new ArrayList<Integer>();
        ListNode temp=head;
        while(temp!=null){
            aa.add(temp.val);
            temp=temp.next;
        }
        aa.remove(aa.size()-n);
        ListNode temp2=new ListNode(-1);
        ListNode temp3=temp2;
        for(int i=0;i<aa.size();i++){
            temp2.next=new ListNode(aa.get(i));
            temp2=temp2.next;
        }
        ListNode temp4=temp3.next;
        return temp4; 


Solution 2:

Without Using additonal space
Time: 0ms 
Space: 42.5Mb

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    
        if(head.next==null){
            return null;
        }
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int val=count-n;
        if(count==n){
            ListNode temp2=head;
            return temp2.next;
        }
        count=0;
        
        ListNode temp1=head;
        ListNode temp2=null;
        while(count!=val){
            count++;
            temp2=temp1;
            temp1=temp1.next;
        }
        ListNode newnext=temp1.next;
        temp2.next=newnext;
        ListNode temp5=head;
        return temp5;
    
    
    }
    
}
