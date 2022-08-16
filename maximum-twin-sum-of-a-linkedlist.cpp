class Solution {
public:    
    int pairSum(ListNode* head) {
        //1.
        ListNode* fast = head;
        ListNode* slow = head;
        // get to the middle of the linkedlist
        while(fast and fast->next){
            fast = fast->next->next;
            slow = slow->next;
        }
        // reverse half of linkedlist
        ListNode* nextNode, *prev = NULL;
        while(slow){
            nextNode = slow->next;
            slow->next = prev;
            prev = slow;
            slow = nextNode;
        }        
        // get max sum of twins
        int ans = INT_MIN;
        while(prev){
            ans = max(ans, head->val + prev->val);
            head = head->next;
            prev = prev->next;
        }
        return ans;
        
        
            
        // //2. 
        // stack<ListNode*> st;
        // ListNode* temp = head;
        // while(head){
        //     st.push(head);
        //     head = head->next;
        // }
        // head = temp;
        // int n = st.size();
        // int ans = INT_MIN;
        // while(st.size() > n/2){
        //     ans = max(ans, head->val + st.top()->val);
        //     st.pop();
        //     head = head->next;
        // }
        // return ans;
    }
};
