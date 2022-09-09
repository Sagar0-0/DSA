class Solution
{
    public:
    Node* helper(Node* root){
        if(!root) return NULL;
        
        if(!root->left && !root->right) return root;
        
        Node* l = helper(root->left);
        Node* r = helper(root->right);
        
        root->left = NULL;
        if(l){
            root->right = l;
            while(l->right){
                l = l->right;
            }
            l-> right = r;
        }
        else if(r) root->right = r;
        
        return root;
    }
    void flatten(Node *root)
    {
        helper(root); 
    }
};
