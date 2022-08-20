
class Solution {
public:
    int maxSum(Node* root,int &sum){
        if(!root) return INT_MIN;
        
        if(!root->left && !root->right) return root->data;
        int l = maxSum(root->left,sum);
        int r = maxSum(root->right,sum);
        
        // cout<<l<<" "<<root->data<<" "<<r<<"\n";
        if(root->left && root->right)     sum = max(l+r+root->data,sum);
        return max(l,r) + root->data;
    }
    int maxPathSum(Node* root)
    {
        int out = 0;
        Node* tmp = root;
        int Sum = INT_MIN;
        out = maxSum(root,Sum);
        if(root->left== NULL || root->right==NULL) Sum = max(Sum,out);
        return Sum;
    }
};
