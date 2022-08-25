class Solution {
public:
    bool isPalindrome(ListNode* head) {
        ListNode* slow = head, *fast = head;
        while(fast and fast->next){
            slow=slow->next;
            fast=fast->next->next;
        }
        
        // reverse half of linkedlist
        ListNode* nextNode, *prev = NULL;
        while(slow){
            nextNode = slow->next;
            slow->next = prev;
            prev = slow;
            slow = nextNode;
        }
        
        while(prev){
            if(prev->val != head->val) return false;
            prev = prev->next;
            head = head->next;
        }
        return true;
    }
};
