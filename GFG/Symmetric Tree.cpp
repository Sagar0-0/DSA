class Solution{
    
    bool checkSymmetry(Node *left,Node *right)
    {
        if(left == nullptr || right == nullptr)
        {
            if(left == right) return true;
            else return false;
        }
        if(left -> data != right -> data) return false;
        
        return (checkSymmetry(left -> left,right -> right)
                &&
                checkSymmetry(left  -> right, right -> left));
        
    }
    public:
  
    // return true/false denoting whether the tree is Symmetric or not
  
    bool isSymmetric(struct Node* root)
    {
	    if(root == nullptr) return true;
	    
	   bool ans = checkSymmetry(root -> left,root -> right);
	   return ans;
    }
