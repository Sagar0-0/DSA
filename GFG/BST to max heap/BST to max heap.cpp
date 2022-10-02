
class Solution{
  public:
    vector<int> v;
    int idx = 0;
    void inorder(Node* root){
        if(!root) return;
        inorder(root->left);
        v.push_back(root->data);
        inorder(root->right);
        return;
    }
    void convert(Node* root){
        if(!root) return;
        convert(root->left);
        convert(root->right);
        root->data = v[idx++];
    }
    void convertToMaxHeapUtil(Node* root)
    {
        if(!root) return;
        inorder(root);
        convert(root);
    }    
};
