class Solution
{
    
    void solve(Node *root,int level,vector<int> &ans)
    {
        if(root == nullptr) return;
        if(ans.size() == level) ans.push_back(root -> data);
        solve(root -> right,level + 1,ans);  // Right recursive call
        solve(root -> left,level + 1,ans);    // Left recursive call
    }
  
    public:
    //Function to return list containing elements of right view of binary tree.
    vector<int> rightView(Node *root)
    {
       vector<int> ans;
       solve(root,0,ans);
       return ans;
    }
};
