
class Solution
{
    //Function to find the number of 'X' total shapes.
    public int xShape(char[][] grid)
    {
        // code here
        int ans=0;
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='X' && vis[i][j]==false){
                    ans++;
                    dfs(grid,i,j,vis);
                }
            }
        }
        return ans;
    }
    void dfs(char[][]grid,int i,int j,boolean[][]vis){
        if(grid[i][j]!='X')return;
        if(vis[i][j])return;
        vis[i][j]=true;
        if(i>0){
            dfs(grid,i-1,j,vis);
        }
        if(i<grid.length-1){
            dfs(grid,i+1,j,vis);
        }
        if(j>0){
            dfs(grid,i,j-1,vis);
        }
        if(j<grid[0].length-1){
            dfs(grid,i,j+1,vis);
        }
    }
}
