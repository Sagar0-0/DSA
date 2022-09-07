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
    string res ="";
    void recur(TreeNode* root){
        if(!root) return;
        res+=to_string(root->val);
        if(!root->left && !root->right) return;
        res+="(";
        recur(root->left);
        res+=")";
        if(root->right){
            res+="(";
            recur(root->right);
            res+=")";
        }
    }
    string tree2str(TreeNode* root) {
//         recursion
        recur(root);
        return res;
    }
//     TC: O(N)
};
