//Function to check whether a binary tree is foldable or not.
bool IsFoldable(Node* root)
{
    // Your code goes here
    if(!root)
        return true;
        
    return checkMirror(root->left, root->right);
}

bool checkMirror(Node* root1, Node* root2)
{
    if(!root1 and !root2)
        return true;
    
    if(!root1 or !root2)
        return false;
    
    return checkMirror(root1->left, root2->right) and checkMirror(root1->right, root2->left);
}

////Another approach but takes more space than above solution

/*
    bool IsFoldable(Node* root)
    {
        // Your code goes here
        queue<Node*> Q;
        Q.push(root);

        while(!Q.empty())
        {
            int sz = Q.size();
            vector<bool> arr;

            while(sz--)
            {
                Node* cur = Q.front();
                Q.pop();

                if(cur)
                {
                    arr.push_back(true);
                    Q.push(cur->left);
                    Q.push(cur->right);
                }
                else
                    arr.push_back(false);
            }

            int n = arr.size();

            for(int i=0; i<n/2; i++)
                if(arr[i] ^ arr[n-i-1])
                    return false;
        }

        return true;
    }
*/
