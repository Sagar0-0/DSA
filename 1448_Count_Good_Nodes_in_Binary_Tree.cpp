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
    void good(TreeNode* root,int &count,int x){
        if(!root)return;
        if(root->val>=x){
            count++;
            x = root->val;
        }
        good(root->left,count,x);
        good(root->right,count,x);

    }
    
    int goodNodes(TreeNode* root) {
        int count =0;
        if(!root) return count;
        good(root,count,root->val);
        return count;
    }
};
