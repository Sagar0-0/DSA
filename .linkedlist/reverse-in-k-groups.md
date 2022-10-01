class Solution {
public:
    ListNode* reverseKGroup(ListNode* head, int k) {
       ListNode* prev=NULL,*curr=head,*nextptr,*temp=head;
        int t=0;
         while(temp){
            temp=temp->next;
            t++;  //size of linked list
        }
        if(t<k) return head;
        int i=0;
        while(i<k){
            nextptr=curr->next;
            curr->next=prev;
            prev=curr;
            curr=nextptr;  
            i++;
        }
        
          head->next=reverseKGroup(nextptr,k);  
      return prev; 
 
    }
};