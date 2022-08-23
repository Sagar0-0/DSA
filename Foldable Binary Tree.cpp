// function that checks it tree with roots are mirror of each other
bool isFoldableUtil(Node *n1, Node *n2){
    // if both left and right subtrees are null
    if(!n1 && !n2) return true;
    // if one tree is null and not other return false
    if(!n1 || !n2) return false;
    
    // check whether left and right subtrees are mirror 
    return isFoldableUtil(n1->left, n2->right) && isFoldableUtil(n1->right, n2->left);
}
//Function to check whether a binary tree is foldable or not.
bool IsFoldable(Node* root)
{
    // Your code goes here
    if(!root) return true;
    return isFoldableUtil(root->left, root->right); 
}

// TC: O(n) -> where n is the number of nodes in binary tree