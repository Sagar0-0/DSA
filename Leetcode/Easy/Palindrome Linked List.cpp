/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
//         defining two pointer and pointing to head 
        ListNode *slow = head, *fast = head, *prev = NULL, *tmp;
        
	    while(fast && fast -> next) // finding mid point
            
		fast = fast -> next -> next, // 2 step jump
        
		tmp = slow -> next, slow -> next = prev, prev = slow, slow = tmp; 
        
	    slow = (fast ? slow -> next : slow); // for odd length case, there will be single middle element at which the slow pointer will point to at the end of iteration.
        
	    while(slow) // check if linked lists starting at prev and slow are equal
            
		if(slow -> val != prev -> val) return false;
		else slow = slow -> next, prev = prev -> next;
	    return true;

        // TC: O(N), SC: O(1)
    }
};