class Solution {
public:
    vector<vector<int>>ans;
    void dfs(vector<int>&curr,TreeNode* root,int target)
    {
        if(!root)
            return;
        curr.push_back(root->val);
        if(root->val==target && !root->left && !root->right)
            ans.push_back(curr);
        dfs(curr,root->left,target-root->val);
        dfs(curr,root->right,target-root->val);
        curr.pop_back();
    }
    ///////
    vector<vector<int>> pathSum(TreeNode* root, int targetSum) 
    {
        vector<int>curr;
        dfs(curr,root,targetSum);
        
        return ans;
    }
};
