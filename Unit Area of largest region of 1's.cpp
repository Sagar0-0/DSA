class Solution
{
    public:
    //Function to find unit area of the largest region of 1s.
    void solve(vector<vector<int>> &grid , int i , int j , int n , int m , int &cnt)
    {
        if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0)
            return;
            
        cnt+=1;
        grid[i][j] = 0;
      
        // 8 directions
        solve(grid,i-1,j,n,m ,cnt);
        solve(grid,i+1,j,n,m ,cnt);
        solve(grid,i,j-1,n,m ,cnt);
        solve(grid,i,j+1,n,m ,cnt);
        solve(grid,i-1,j-1,n,m ,cnt);
        solve(grid,i-1,j+1,n,m ,cnt);
        solve(grid,i+1,j-1,n,m ,cnt);
        solve(grid,i+1,j+1,n,m ,cnt);
    }
  
    int findMaxArea(vector<vector<int>>& grid) 
    {
        int ans = 0;
        int n = grid.size() , m = grid[0].size();
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                if(grid[i][j] == 1)
                {
                    int cnt = 0;
                    solve(grid , i , j , n , m , cnt);
                    ans = max(ans , cnt);
                }
            }
        }
        
        return ans;
        // Code here
    }
};
