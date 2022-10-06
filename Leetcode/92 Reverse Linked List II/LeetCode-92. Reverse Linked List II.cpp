// Approach I


class Solution {
public:
    
    ListNode *l;
    bool stop;

    void recurseAndReverse(ListNode* right, int m, int n)
    {
        if(n==1)
        {
            return;
        }

        right = right->next;

        if(m > 1)
        {
            l = l->next;
        }

        recurseAndReverse(right, m-1, n-1);

        if(l == right || right->next == l)
        {
            stop = true;
        }

        if(!stop)
        {
            int t = l->val;
            l->val = right->val;
            right->val = t;

            l = l->next;
        }
    }

    ListNode *reverseBetween(ListNode *head, int left, int right)
    {
        l = head;
        stop = false;
        recurseAndReverse(head, left, right);
        return head;
    }
};


// Approach II

class Solution
    {
    public:
        ListNode *reverseBetween(ListNode *head, int left, int right)
        {

            // Empty list

            if (head == NULL)
                return NULL;

            // Move the two pointers until they reach the proper starting point in the list.

            ListNode *curr = head, *prev = NULL;
            while (left > 1)
            {
                prev = curr;
                curr = curr->next;
                left--;
                right--;
            }

            // The two pointers that will fix the final connections.

            ListNode *con = prev, *tail = curr;

            // Iteratively reverse the nodes until n becomes 0.

            ListNode *third = NULL;
            while (right > 0)
            {
                third = curr->next;
                curr->next = prev;
                prev = curr;
                curr = third;
                right--;
            }

            // Adjust the final connections as explained in the algorithm

            if (con != NULL)
            {
                con->next = prev;
            }
            else
            {
                head = prev;
            }

            tail->next = curr;
            return head;
        }
};
