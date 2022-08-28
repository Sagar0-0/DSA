struct Node
{
    int data;
    struct Node* left;
    struct Node* right;
    
    Node(int x){
        data = x;
        left = right = NULL;
    }
};

// This function should return head to the DLL
class Solution
{
    public: 
    Node *p = NULL, *h = NULL;
    void inorder(Node* root){
        if(!root) return;
        inorder(root->left);
        root->left = p;
        p = root;
        inorder(root->right);
    }
    //Function to convert binary tree to doubly linked list and return it.
    Node * bToDLL(Node *root)
    {
        // your code here
        inorder(root); // making one traversal from left to right of doubly linkedList
      
      // making another traversal from right to left of DLL
      // if you are heading from right to left then for DLL your next is right and prev is left
        // if you are heading from left to right then for DLL your next is left and prev is right
        Node* t = p, *p1 = NULL;
        t->right = p1;
        while(t->left != NULL){
            p1 = t;
            t = t->left;
            t->right = p1;
        }
        h = t;
        return h;
    }
};
