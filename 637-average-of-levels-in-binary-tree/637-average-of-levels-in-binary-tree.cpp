class Solution {
public:
    vector<double> averageOfLevels(TreeNode* root) {
        queue<TreeNode*> q;
        q.push(root);
        vector<double> v;
        while(!q.empty()){
            int n = q.size();
            double d=0;                        
            for(int i=0;i<n;i++){
                TreeNode* node = q.front();
                if(node->left) q.push(node->left);
                if(node->right) q.push(node->right);
                q.pop();
                d += node->val;
            }
            v.push_back(d/n);
        }
        return v;
    }
};
