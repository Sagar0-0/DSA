class Solution
{
public:
    vector<pair<int, int>> findPairsWithGivenSum(Node *head, int target)
    {
        // code here
        vector<pair<int,int>> ans;
        
        Node* front = head;
        Node* rear = head;
        
        while(rear->next)
        rear = rear->next;
        
        while(front->data < rear->data)
        {
            int num1 = front->data, num2 = rear->data;
            
            if(num1 + num2 == target)
            {
                ans.push_back({num1, num2});
                front = front->next;
            }
            
            else if(num1 + num2 > target)
                rear = rear->prev;
                
            else
                front = front->next;
        }
        
        return ans;
    }
};
