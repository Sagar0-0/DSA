class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        
        ListNode temp;
        
        if(l1.val<=l2.val){
            temp=l1;
            l1=l1.next;
        }else{
            temp=l2;
            l2=l2.next;
        }
        ListNode ansNode=temp; 
        
        
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                temp.next=l1;
                l1=l1.next;
            }else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        if(l1==null){
            temp.next=l2;
        }else{
            temp.next=l1;
        }
        
        return ansNode;
    }
}
