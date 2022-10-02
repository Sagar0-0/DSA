// Q) Given the root of a binary tree, return the average value of the nodes on each level in the form of an array. 
//Answers within 10-5 of the actual answer will be accepted.



/// We can directly do a Breadth-First search, which would be more intuitive and efficient than DFS, 
//since we are concerned with each levels of the binary Tree(exactly what BFS achieves).

///As in any BFS, we use a simple queue, iterate nodes at each row & push their children to queue after popping the current node. 
//For each row, sum of all node's value at that level of the binary tree would be calculated and the average would be stored in ans array 
//which will be our final answer.




class Solution {
public:
    vector<double> averageOfLevels(TreeNode* root) {
        vector<double> ans;
        queue<TreeNode*> q;
        q.push(root);
        
        // while there are nodes remaining to be visited
        while(!q.empty()){
            double temp = q.size();
            double sum = 0;
            // iterating each level of binary tree
            for(int i = 0; i < temp; i++){
                auto tt = q.front();
                q.pop();
                sum += (tt->val);
				// check for not NULL and pushing into queue.
                if(tt->left){
                    q.push(tt->left);
                }
                if(tt->right){
                    q.push(tt->right);
                }
            }
            ans.push_back(sum/ temp);
        }
        return ans;
    }
};
