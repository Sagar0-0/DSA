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
