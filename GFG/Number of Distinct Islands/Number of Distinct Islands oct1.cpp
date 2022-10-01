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