class Solution {
    public int numIslands(char[][] grid) {
        int ans=0;
        int n=grid.length;
        int m=grid[0].length;
        boolean[][]vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    ans++;
                    dfs(grid,i,j,vis);
                }
            }
        }
        return ans;
    }
    public void dfs(char[][]grid,int i,int j,boolean[][]vis){
        if(!valid(grid,i,j,vis))return;
        vis[i][j]=true;
        dfs(grid,i+1,j,vis);
        dfs(grid,i-1,j,vis);
        dfs(grid,i,j+1,vis);
        dfs(grid,i,j-1,vis);
    }
    boolean valid(char[][]grid,int i,int j,boolean[][]vis){
        if(i<0 || j<0 || i==grid.length || j==grid[0].length || grid[i][j]=='0' || vis[i][j])return false;
        return true;
    }
}