/*
  Approach : 
    1. Find mid point of linked list.Divide the LL into two respective LL's.
    2. Now reverse either one of the LL.
    3. Traverse both LL's simulatenously and if at any instant their data doesn't match -> return false;
*/

class Solution {
public:
ListNode* reverseNode(ListNode* head){
    if(!head) return head;
    
    ListNode* nx = head->next, *prev = NULL, *curr = head;
    
    while(curr){
        nx = curr->next;
        curr->next = prev;
        prev = curr;
        curr = nx;
    }
    return prev;
}
    bool isPalindrome(ListNode* head) {
        if(!head) return true;
        
        
        ListNode *slow = head, *fast = head->next;
        
        while(fast && fast->next){
            slow = slow->next;
            fast = fast->next;
            if(fast){
                fast = fast->next;
            }
        }
        
        ListNode* tmp = slow->next;
        slow->next = NULL;
      
        ListNode* rev = reverseNode(tmp);
 
        while(rev && head){
            if(rev->val != head->val) return false;
            
            rev = rev->next;
            head = head->next;
        }
        
        return true;
    }
};


