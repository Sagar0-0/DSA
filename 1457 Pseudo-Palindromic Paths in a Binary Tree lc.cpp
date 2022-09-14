class Solution {
public:
    vector<int> a; //map count nodes with same value
    int ans; // store ans
    bool checkPalin(){
        int cnt=0;
        for(int i=1;i<10;i++){ 
            if(a[i]&1){
                cnt++;
            }
        }
        if(cnt>1) return false;
        else return true;
    }
    void solve(TreeNode *root){
        if(!root) return;
        if(!root->left && !root->right){
            a[root->val]++;
            if(checkPalin()) ans++;
            a[root->val]--;
            
            return ;
        }
        a[root->val]++;
        solve(root->left);
        solve(root->right);
        a[root->val]--;
    }
    int pseudoPalindromicPaths (TreeNode* root) {
        ans=0;
        a.resize(10,0);
        solve(root);
        return ans;
    }
};