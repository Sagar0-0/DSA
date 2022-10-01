class Solution {
public:
    int cnt=0;
    void dfs(TreeNode* root,long long target)
    {
        if(!root)
            return;
        if(root->val==target)
            cnt++;
        dfs(root->left,target-root->val);
        dfs(root->right,target-root->val);
    }
    /////////
    int pathSum(TreeNode* root, int targetSum) 
    {
        if(root)
        {
            dfs(root,targetSum);
            pathSum(root->left,targetSum);
            pathSum(root->right,targetSum);
        }
        return cnt;
    }
};
