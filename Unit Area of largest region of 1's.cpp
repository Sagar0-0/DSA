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

// class Solution
// {
//     public:
    
//     int n, m;
//     int dx[8] = {-1, -1, -1, 0, 0, 1, 1, 1};
//     int dy[8] = {-1, 0, 1, -1, 1, -1, 0, 1};
    
//     // Function to count the area of adjacent elements
//     int countArea(vector<vector<int>>& grid, int i, int j)
//     {
//         if(i < 0 or i >= n or j < 0 or j >= m or grid[i][j] == 0)
//         return 0;
        
//         int ans = 1;
//         grid[i][j] = 0;
        
//         for(int d=0; d<8; d++)
//             ans += countArea(grid, i+dx[d], j+dy[d]);
            
//         return ans;
//     }
    
//     //Function to find unit area of the largest region of 1s.
//     int findMaxArea(vector<vector<int>>& grid) {
//         // Code here
//         n = grid.size();
//         m = grid[0].size();
        
//         int ans = 0;
        
//         for(int i=0; i<n; i++)
//         {
//             for(int j=0; j<m; j++)
//             {
//                 if(grid[i][j] == 1)
//                 ans = max(ans, countArea(grid, i, j));
//             }
//         }
        
//         return ans;
//     }
// };
