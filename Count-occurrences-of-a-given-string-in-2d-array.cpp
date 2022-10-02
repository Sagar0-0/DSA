
class Solution{
    public:
    
    int ans = 0;
    void dfs(int i, int j, vector<vector<char>> &mat, string target, int ind, string s){
        if(i < 0 || j < 0 || i >= mat.size() || j >= mat[0].size() || mat[i][j] != target[ind])
            return;
        if(ind == target.size()-1){
            ans++;
            return;
        }
        char ch = mat[i][j];
        mat[i][j] = '0';
        dfs(i+1,j,mat,target,ind+1,s+mat[i][j]);
        dfs(i,j+1,mat,target,ind+1,s+mat[i][j]);
        dfs(i-1,j,mat,target,ind+1,s+mat[i][j]);
        dfs(i,j-1,mat,target,ind+1,s+mat[i][j]);
        
        mat[i][j] = ch;
        
    }
    
    int findOccurrence(vector<vector<char> > &mat, string target){
        int n = mat.size();
        int m = mat[0].size();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == target[0]){
                    dfs(i,j,mat,target,0,"");
                }
            }
        }
        return ans;
    }
};
