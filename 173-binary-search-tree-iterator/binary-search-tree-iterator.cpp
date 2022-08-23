#include<bits/stdc++.h>
class BSTIterator {    
//I use Stack to store directed left children from root.              
// When next() be called, I just pop one element and process its right child as new root.
    stack<TreeNode*> stack;
public:                    
    BSTIterator(TreeNode* root) {
        addElements(root);
    }
    
    int next() {
        TreeNode* temp = stack.top();
        stack.pop();
        addElements(temp->right);
        return temp->val;
    }
    
    bool hasNext() {
        return !stack.empty();
    }
private:
    void addElements(TreeNode* node){
        for(;node != NULL; stack.push(node), node=node->left);
    }
};
