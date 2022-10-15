class Solution {
  public:
    bool isSafe(int i,int j,int n,int m){
      if(i<0 || j<0 || i>=n || j>=m)
      return false;
      return true;
  }

    int shortestPath(vector<vector<int>> &grid, pair<int, int> source, pair<int, int> destination){
        if(source==destination){
            return 0;
        }
        int n=grid.size();
        int m =grid[0].size();
        queue<pair<pair<int,int>,int>>q;
        q.push({source,0});
        grid[source.first][source.second]=0;
        while(!q.empty()){
                int row = q.front().first.first;
                int col = q.front().first.second;
                int dis = q.front().second;
                q.pop();
                if(row==destination.first && col==destination.second){
                    return dis;
                }
                if(isSafe(row+1,col,n,m) && grid[row+1][col]==1){
                    q.push({{row+1,col},dis+1});
                    grid[row+1][col]=0;
                }
                if(isSafe(row-1,col,n,m) && grid[row-1][col]==1){
                    q.push({{row-1,col},dis+1});
                    grid[row-1][col]=0;
                }
                if(isSafe(row,col+1,n,m) && grid[row][col+1]==1){
                    q.push({{row,col+1},dis+1});
                    grid[row][col+1]=0;
                }
                if(isSafe(row,col-1,n,m) && grid[row][col-1]==1){
                    q.push({{row,col-1},dis+1});
                    grid[row][col-1]=0;
                }
        }
        return -1;
    }
};
