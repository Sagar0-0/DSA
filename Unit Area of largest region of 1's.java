class Solution
{
    //Function to find unit area of the largest region of 1s.
    public int findMaxArea(int[][] grid)
    {
        // Code here
        int ans=0;
        boolean[][]vis=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!vis[i][j] && grid[i][j]==1){
                    ans=Math.max(ans,dfs(grid,i,j,vis));
                }
            }
        }
        return ans;
    }
    int dfs(int[][]grid,int i,int j,boolean[][]vis){
        if(!valid(grid,i,j,vis))return 0;
        vis[i][j]=true;
        int ans=1;
        ans+=dfs(grid,i+1,j,vis);
        ans+=dfs(grid,i-1,j,vis);
        ans+=dfs(grid,i,j+1,vis);
        ans+=dfs(grid,i,j-1,vis);
        ans+=dfs(grid,i+1,j+1,vis);
        ans+=dfs(grid,i+1,j-1,vis);
        ans+=dfs(grid,i-1,j+1,vis);
        ans+=dfs(grid,i-1,j-1,vis);
        return ans;
    }
    boolean valid(int[][]grid,int i,int j,boolean[][]vis){
        if(i<0 || j<0 || i==grid.length || j==grid[0].length
        || grid[i][j]==0 || vis[i][j])return false;
        return true;
    }
}

//Approach-2

class Solution
{
    int count;
    static boolean isSafe(int[][] grid,int row,int col,boolean[][] visited,int ROW,int COL)
    {
        if(row<0 || col<0 || row>=ROW || col>=COL || visited[row][col] || grid[row][col]==0)
            return false;
        return true;    
    }

    
    void DFS(int[][] grid,int row,int col,boolean[][] visited,int ROW,int COL)
    {
        int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };

        visited[row][col] = true;

        for (int k = 0; k < 8; k++) 
        {
            if (isSafe(grid, row + x[k], col + y[k],visited, ROW, COL)) 
            {
                count++;
                DFS(grid, row + x[k], col + y[k],visited, ROW, COL);
            }
        }
    }
    
    public int findMaxArea(int[][] grid)
    {
        int ROW = grid.length;
        int COL = grid[0].length;
        
        boolean[][] visited = new boolean[ROW][COL];

        int result = 0;
      
        for (int i = 0; i < ROW; i++) 
        {
            for (int j = 0; j < COL; j++) 
            {
                
                if (grid[i][j] == 1 && !visited[i][j]) 
                {
                    count = 1;
                    DFS(grid, i, j, visited, ROW, COL);

                    result = Math.max(result, count);
                }
            }
        }
        return result;
    }
}

    
   
