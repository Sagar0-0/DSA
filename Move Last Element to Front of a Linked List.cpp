class Solution{
public:
    ListNode *moveToFront(ListNode *head){
        if(!head || !head->next) return head;
        ListNode *node = head;
        ListNode * prev = NULL;
        
        while(node->next != NULL){
            prev = node;
            node = node->next;
        }
        node->next = head;
        prev->next = NULL;
        return node;
    }
};
