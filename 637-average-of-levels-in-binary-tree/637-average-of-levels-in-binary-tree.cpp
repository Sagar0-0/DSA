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


// Same approach:
// class Solution {
// public:
//     vector<double> ans;
//     void getAverage(TreeNode *root){
//         queue<TreeNode*> q;
//         q.push(root);
//         while(!q.empty()){
//             double size = q.size();
//             double sum = 0;
//             for(int i = 0; i < size; i++){
//                 auto node = q.front();
//                 q.pop();
//                 sum += node->val;
//                 if(node->left)
//                     q.push(node->left);
//                 if(node->right)
//                     q.push(node->right);
//             }
//             ans.push_back(sum / size);
//         }
//     }
    
//     vector<double> averageOfLevels(TreeNode* root) {
//         getAverage(root);
//         return ans;
//     }
// };
