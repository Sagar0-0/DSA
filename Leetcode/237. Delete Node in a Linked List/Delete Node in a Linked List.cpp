/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    void deleteNode(ListNode* node) {
        // swap(node,node->next);
        // ListNode* temp = node;
        int temp = node->next->val;
        node->next->val = node->val;
        node->val = temp;
        node->next = node->next->next;
        // ListNode *t = node->next;
        // free(node);
        // node = t;
        // free(t);
        // cout<<node->val<<endl;
    }
};
