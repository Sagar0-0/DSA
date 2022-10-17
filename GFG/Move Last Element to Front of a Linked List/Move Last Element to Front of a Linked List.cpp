class Solution{
public:
    ListNode *moveToFront(ListNode *head){
        
        if(head->next == NULL) return head;
        
        ListNode *temp = head;
        
        while(head->next->next!=NULL)
     
        head = head->next;
        head->next->next = temp;
        temp = head->next;
        head->next = NULL;
        
        return temp;
        
    }
};
