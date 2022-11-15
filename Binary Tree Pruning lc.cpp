#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
//     TC: O(N) where N is the number of the nodes in the tree
//     SC: O(H) where H is the height of the tree
//     In worse case, H can be N when it is a left skewed binary tree / right skewed binary tree
    TreeNode* pruneTree(TreeNode* root) {
//         if root is nullptr, then return nullptr
        if(!root) return nullptr;
//         DFS on left sub tree
        root->left = pruneTree(root->left);
//         DFS on right sub tree
        root->right = pruneTree(root->right);
//         !root->left means left sub tree does not contain 1
//         !root->right means right sub tree does not contain 1
//         !root->val means curr_node val is 0
//         for this case , return nullptr else keep node
        return(!root->left && !root->right && !root->val) ? nullptr : root;
    }
};

