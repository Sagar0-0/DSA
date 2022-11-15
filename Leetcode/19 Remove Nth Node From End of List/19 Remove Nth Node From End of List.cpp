//Here are two Approach both one are optimal first Approch use O(n) time complexity and second Approch use O(n^2) time complexity

//===================================== Approch 1 ==========================================

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int count =0;
        ListNode* p = head;
        while(p!=NULL){
            count++;
            p=p->next;
        }
        
        if(count==1){
            return NULL;
        }
        
        int x = count-n;
        if(x==0){
            return head->next;
        }
        p = head;
        for(int i =0;i<x-1;i++){
            p=p->next;
        }
        p->next = p->next->next;
        return head;
    }
};




//=============================Approch 2 ========================================================



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
