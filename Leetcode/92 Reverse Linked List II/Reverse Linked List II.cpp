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
    ListNode* reverseBetween(ListNode* head, int left, int right) {
       int count=0;
        ListNode* p = head;
        while(p!=NULL){
            count++;
            p=p->next;
        }
        p = head;
        vector<int> v;
        while(p!=NULL){
           v.push_back(p->val);
           p=p->next; 
        }
        reverse(v.begin()+left-1,v.begin()+right);
        p = head;
        int i=0;
        while(p!=NULL){
            p->val = v[i];
            p=p->next;
            i++;
        }
        return head;
    }
};


 // ListNode* p = head;
 //        int count =0;
 //        while(p!=NULL){
 //            count++;
 //            p=p->next;
 //        }
 //        p = head;
 //        int a[count];
 //        int i =0;
 //        while(p!=NULL){
 //            a[i]=p->val;
 //            p=p->next;
 //            i++;
 //        }
 //        p = head;
 //        reverse(a+(left-1),a+right);
 //        int j =0;
 //        while(p!=NULL){
 //            p->val = a[j];
 //            p=p->next;
 //            j++;
 //        }
 //        return head;
