/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
public:
    vector<vector<int>> levelOrder(Node* root) {
        vector<vector<int>> v;
        queue<Node*> q;
        q.push(root);
        if(!root){return {};}
        while(!q.empty()){
            vector<int> v1;
            int n = q.size();
            for(int i =0;i<n;i++){
                Node* t = q.front();
                q.pop();
                for(auto it: t->children){
                    q.push(it);
                }
                v1.push_back(t->val);
            }
            v.push_back(v1);
        }
        return v;
    }
};
