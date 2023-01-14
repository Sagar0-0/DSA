class Solution {
  public:
    int subtree(Node* root, int& ans){
        if(root==NULL){
            return 0;
        }
        int lsum = subtree(root->left,ans);
        int rsum = subtree(root->right,ans);
        int tot = root->data + lsum + rsum;
        ans = max(ans,tot);
        return tot;
    }
    int findLargestSubtreeSum(Node* root){
        int ans = INT_MIN;
        subtree(root,ans);
        return ans;
        
    }
};
