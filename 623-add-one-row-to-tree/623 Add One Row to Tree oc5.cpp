#include<bits/stdc++.h>
using namespace std;

struct TreeNode{
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution {
public:
    TreeNode* addOneRow(TreeNode* root, int val, int depth) {
if(depth == 1) // if depth is 1, then we have to simply add root
        {
            TreeNode* newNode = new TreeNode(val);
            newNode -> left = root;
            return newNode; // now this act as new root
        }
        
        queue<TreeNode*> q; // defineing queue
        q.push(root); // push queue
        int count = 0; // variable to count level
        
        // start bfs
        while(!q.empty()) 
        {
            // since we have to add values on all of the nodes
            // present at that level, so take out the size
            int n = q.size(); 
            
            count++; // increase size
            while(n--)
            {
                TreeNode* curr = q.front(); // take out current node
                q.pop(); // pop it from queue
                
                // if we not reach till our required level
                // so we have to do nothing, simply push into queue
                if(count != depth - 1) 
                {
                    if(curr -> left) q.push(curr -> left);
                    if(curr -> right) q.push(curr -> right);
                }
                else // else we reach our required level
                {
                    // make a new node to add
                    TreeNode* newNode = new TreeNode(val);
                    // first put left of curr to newNode
                    newNode -> left = curr -> left;
                    // now curr of left becomes newNode
                    curr -> left = newNode;
                    
                    // make a new node to add
                    TreeNode* newNode2 = new TreeNode(val);
                    // first put right of curr to newNode
                    newNode2 -> right = curr -> right;
                     // now curr of right becomes newNode
                    curr -> right = newNode2;
                }
            }
        }

        return root;
    }
};