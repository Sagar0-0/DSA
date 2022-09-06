class Solution {
public:
    vector<vector<int>> levelOrder(Node* root) {
        if(!root) return {};
        vector<vector<int>> ans;
        queue<Node*> q;
        q.push(root);
        while(!q.empty()){
            int n = q.size();
            vector<int> v;
            for(int i=0;i<n;i++){
                Node* node = q.front();q.pop();
                v.push_back(node->val);
                for(Node* child : node->children) q.push(child);
            }
            ans.push_back(v);
        }
        return ans;
    }
};
