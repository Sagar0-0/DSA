#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<vector<int>> ans;
    void dfs(TreeNode* node, vector<int>& path, int remainingSum) {
        if (!node) return;
        path.push_back(node-> val);
        if (!node->left && !node->right && remainingSum == node->val) ans.push_back(path);
        dfs(node-> left, path, remainingSum - node-> val);
        dfs(node-> right, path, remainingSum - node-> val);
        // backtrack 
        path.pop_back();
    }
    vector<vector<int>> pathSum(TreeNode* root, int targetSum) {
        // used to store current route
        vector<int> path;
        // dfs from the root
        dfs(root, path, targetSum);
        return ans;  
    }
};