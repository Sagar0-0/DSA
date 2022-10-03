class Solution {
public:
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        //pushing all list values into min heap
        priority_queue<int, vector<int>, greater<int> > mh;
        for(auto head : lists){
            while(head){
                mh.push(head -> val);
                head = head -> next;
            }
        }
        
        //if there is no element in lists
        if(mh.size() == 0) return NULL;
        
        //creating head node of resultant list
        ListNode * head = new ListNode(mh.top());
        mh.pop();
        //we will traverse the head so storing it for returning
        ListNode * ans_head = head;
        
        //creating final list and poping the min heap
        int n = mh.size();
        while(n--){
            head -> next = new ListNode(mh.top());
            mh.pop();
            head = head -> next;
        }
        
        return ans_head;
    }
};