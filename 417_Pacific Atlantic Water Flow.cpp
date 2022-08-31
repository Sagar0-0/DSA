#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:

    // using dfs 
        int m, n;
    // this denotes cells reachable starting from atlantic and pacific edged cells resp
    vector<vector<bool> > atlantic, pacific;
	vector<vector<int> > res;    
    vector<vector<int> > pacificAtlantic(vector<vector<int>>& heights) {
        if(!size(heights)) return res; // check for null condition
        m = size(heights), n = size(heights[0]); // initializing row and col

    // taking bolean matrices(vector), to see whether a cell that can reach the  atalantic of pacific
        atlantic = pacific = vector<vector<bool> >(m, vector<bool>(n, false));
		// perform dfs from all edge cells (ocean-connected cells)
        for(int i = 0; i < m; i++) dfs(heights, pacific, i, 0), dfs(heights, atlantic, i, n - 1);
        for(int i = 0; i < n; i++) dfs(heights, pacific, 0, i), dfs(heights, atlantic, m - 1, i);             
        return res;
    }
    // define dfs
    void dfs(vector<vector<int> >& mat, vector<vector<bool> >& visited, int i, int j){        
        if(visited[i][j]) return;
        visited[i][j] = true;
		// if cell reachable from both the oceans, insert into final result vector
        if(atlantic[i][j] && pacific[i][j]) res.push_back(vector<int>{i, j});    
		// dfs from current cell only if height of next cell is greater
/*down dir*/  if(i + 1 <  m && mat[i + 1][j] >= mat[i][j]) dfs(mat, visited, i + 1, j); 
/*Up dir*/  if(i - 1 >= 0 && mat[i - 1][j] >= mat[i][j]) dfs(mat, visited, i - 1, j);
/*right dir*/  if(j + 1 <  n && mat[i][j + 1] >= mat[i][j]) dfs(mat, visited, i, j + 1); 
/*left dir*/  if(j - 1 >= 0 && mat[i][j - 1] >= mat[i][j]) dfs(mat, visited, i, j - 1);
    }
};
int main(){

}