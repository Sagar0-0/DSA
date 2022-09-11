#include <bits/stdc++.h>
using namespace std;

class Solution{
    public:
    int dfs(int i, int j, int ind, vector<vector<char>>&mat, string target, vector<vector<bool>>&vis){
        int n = mat.size(), m = mat[0].size();
        if(i<0 or j <0 or i>=n or j >=m or vis[i][j] or mat[i][j] !=target[ind]) return 0;
        
        if(ind ==target.size()-1) return 1;
        vis[i][j]=true;
        int res =0;
        
       res += dfs(i+1, j,ind+1,mat, target, vis);
       res += dfs(i, j+1, ind+1, mat, target, vis);
       res += dfs(i-1, j, ind+1, mat, target, vis);
       res += dfs(i, j-1, ind+1, mat, target, vis);
       
       vis[i][j]= false;
       return res;
        
    }
    int findOccurrence(vector<vector<char> > &mat, string target){
        // dfs + backtracking approach
        int n= mat.size(), m= mat[0].size();
        vector<vector<bool>>visited(n,vector<bool>(m,false));
        
        int res =0;
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                res+= dfs(i,j,0, mat,target,visited);
            }
        }
        return res;
    }
};
int main() {
    int t;
    cin >> t;
    while (t--) {
        int R, C;
        cin >> R >> C;
        vector<vector<char> > mat(R);
        for (int i = 0; i < R; i++) {
            mat[i].resize(C);
            for (int j = 0; j < C; j++) cin >> mat[i][j];
        }
        string target;
        cin >> target;
        Solution obj;
        cout<<obj.findOccurrence(mat,target)<<endl;
    }
}