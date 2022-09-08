#include<bits/stdc++.h>
using namespace std;

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<int> res;
    void inorder(TreeNode* node){
        if(!node) return;
//         traverse the left node
        inorder(node->left);
//         do something with node value here
        res.push_back(node->val);
//         traverse right
        inorder(node->right);
    }
    vector<int> inorderTraversal(TreeNode* root) {
        inorder(root);
        return res;
    }
};