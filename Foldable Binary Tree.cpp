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
