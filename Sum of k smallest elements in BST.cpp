// Function to find ceil of a given input in BST. If input is more 
// than the max key in BST, return -1 
int sum(Node* root, int k) 
{ 
    // Your code here
    int ans = 0;
    
    if(!root)
        return ans;
    
    Node* cur = root;
    stack<Node*> S;
    
    while((!S.empty() or cur) and k--)
    {
        while(cur)
        {
            S.push(cur);
            cur = cur->left;
        }
        
        cur = S.top();
        S.pop();
        
        ans += cur->data;
        
        cur = cur->right;
    }
    
    return ans;
} 
