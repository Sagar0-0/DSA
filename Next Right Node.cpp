class Solution
{
public:
    Node *nextRight(Node *root, int key)
    {
        //code here
        if(key == root->data) return new Node(-1);
        queue<Node*> q;
        q.push(root);
        while(!q.empty()){
            int n = q.size();
            vector<Node*> v;
            for(int i=0;i<n;i++){
                Node* node = q.front();
                if(node->left) q.push(node->left);
                if(node->right) q.push(node->right);
                v.push_back(node);
                q.pop();
            }
            for(int i=0;i<v.size()-1;i++){
                if(v[i]->data == key) return v[i+1];
            }
            if(v[v.size()-1]->data == key) return new Node(-1);
        }
        return new Node(-1);
    }
};
