void solve(Node *root,int &ans)
{
    if (root == NULL) return;
    if (root->left == NULL && root->right == NULL)
    {
        ans++;
    }  

    solve(root->left, ans); // left recusive call 
    solve(root->right, ans); // right recusive call 
}

int countLeaves(Node* root)
{
        int ans = 0;
        solve(root,ans);
        return ans;
}
