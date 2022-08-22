class Solution {
  public:
    
    int minTime(Node* root, int target) 
    {
        // Your code goes here
        Node* start;
        unordered_map<Node*, Node*> parent;
        
        queue<Node*> Q;
        Q.push(root);
        
        while(!Q.empty())
        {
            int sz = Q.size();
            
            while(sz--)
            {
                Node* cur = Q.front();
                Q.pop();
                
                if(cur->data == target)
                start = cur;
                
                if(cur->left)
                {
                    Q.push(cur->left);
                    parent[cur->left] = cur;
                }
                
                if(cur->right)
                {
                    Q.push(cur->right);
                    parent[cur->right] = cur;
                }
            }
        }
        
        Q.push(start);
        
        set<int> burned;
        
        int t = -1;
        
        while(!Q.empty())
        {
            int sz = Q.size();
            
            while(sz--)
            {
                Node* cur = Q.front();
                Q.pop();
                
                burned.insert(cur->data);
                
                if(cur != root and burned.find(parent[cur]->data) == burned.end())
                    Q.push(parent[cur]);
                
                if(cur->left and burned.find(cur->left->data) == burned.end())
                    Q.push(cur->left);
                
                if(cur->right and burned.find(cur->right->data) == burned.end())
                    Q.push(cur->right);
            }
            
            t++;
        }
        
        return t;
    }
};
