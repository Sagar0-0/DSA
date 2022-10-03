#include <bits/stdc++.h>
using namespace std;

class Solution {
  public:
  void dfs(vector<vector<int>>& grid, int i, int j, int xi, int xj, int n, int m, vector<int>&ans){
      if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0) return;
      
      ans.push_back(i-xi);
      ans.push_back(j-xj);
      grid[i][j] =0;
      dfs(grid, i-1, j, xi, xj, n,m, ans);
      dfs(grid, i+1, j, xi, xj, n,m, ans);
      dfs(grid, i, j-1, xi, xj, n,m, ans);
      dfs(grid, i, j+1, xi, xj, n,m, ans);
  }
    int countDistinctIslands(vector<vector<int>>& grid) {
        // code here
        set<vector<int>>st;
        int n = grid.size(), m= grid[0].size();
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                if(grid[i][j]==1){
                    vector<int>ans;
                    dfs(grid,i,j,i,j,n,m,ans);
                    st.insert(ans);
                }
            }
        }
        return st.size();
    }
};
int main() {

    int t;
    cin >> t;
    while (t--) {
        int n, m;
        cin >> n >> m;
        vector<vector<int>> grid(n, vector<int>(m));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cin >> grid[i][j];
            }
        }
        Solution obj;
        cout << obj.countDistinctIslands(grid) << endl;
    }
}


// Another Approach :
/*
  Instead of changing the original content/values of grid vector, we can also use a different vector storing each visited indexes,
  while keeping grid vector intact, as in general it's not recommended to change values of original vector.
  
  Below is my Code class implementing my logic, I hope it will help,
*/

class Solution {
  public:
void dfs(int i,int j,int r,int c,vector<vector<int>> &vis, vector<vector<int>> &v,vector<vector<int>>&a){
    int n = v.size(), m = v[0].size();
    if(r>=n || c>=m || r<0 || c<0 || v[r][c]==0 || vis[r][c]==1) return;
    
    a.push_back({i,j});
    vis[r][c] = 1;
    
    dfs(i+1,j,r+1,c,vis,v,a);
    dfs(i,j+1,r,c+1,vis,v,a);
    dfs(i-1,j,r-1,c,vis,v,a);
    dfs(i,j-1,r,c-1,vis,v,a);
    
}  
    int countDistinctIslands(vector<vector<int>>& grid) {
        set<vector<vector<int>>> st;
        
        vector<vector<int>> vis(grid.size(),vector<int>(grid[0].size(),0));
        
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[0].size();j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    vector<vector<int>> v;
                    dfs(0,0,i,j,vis,grid,v);
                    if(v.size()>0)  st.insert(v);
                }
            }
        }
        
        
        return st.size();
    }
};
