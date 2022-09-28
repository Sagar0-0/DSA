#include<bits/stdc++.h>
using namespace std;

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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode *prev = head, *NextNode = head;
        
        for(int i =0; i<n; i++)
            prev = prev->next;
            if(!prev) return head->next;
            
            while(prev->next){
                NextNode = NextNode->next;
                prev = prev->next;
            }
            NextNode->next = NextNode->next->next;
        return head;
    }
};