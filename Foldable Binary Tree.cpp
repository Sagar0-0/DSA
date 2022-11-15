<<<<<<< HEAD
// function that checks it tree with roots are mirror of each other
bool isFoldableUtil(Node *n1, Node *n2){
    // if both left and right subtrees are null
    if(!n1 && !n2) return true;
    // if one tree is null and not other return false
    if(!n1 || !n2) return false;
    
    // check whether left and right subtrees are mirror 
    return isFoldableUtil(n1->left, n2->right) && isFoldableUtil(n1->right, n2->left);
}
=======
>>>>>>> upstream/main
//Function to check whether a binary tree is foldable or not.
bool IsFoldable(Node* root)
{
    // Your code goes here
<<<<<<< HEAD
    if(!root) return true;
    return isFoldableUtil(root->left, root->right); 
}

// TC: O(n) -> where n is the number of nodes in binary tree
=======
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
>>>>>>> upstream/main
