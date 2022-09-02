class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int[][] vis=new int[n][m];
        
        for(int j=0;j<m;j++){
            if(grid[0][j]==1 && vis[0][j]==0) dfs(grid,vis,0,j);
        }
        for(int i=0;i<n;i++){
            if(grid[i][0]==1 && vis[i][0]==0) dfs(grid,vis,i,0);
        }
        for(int i=0;i<n;i++){
            if(grid[i][m-1]==1 && vis[i][m-1]==0) dfs(grid,vis,i,m-1);
        }
        for(int j=0;j<m;j++){
            if(grid[n-1][j]==1 && vis[n-1][j]==0) dfs(grid,vis,n-1,j);
        }
        
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
    
    public void dfs(int[][] a,int[][] vis,int i,int j){
        if(i<0 || i>=a.length || j<0 || j>=a[0].length || vis[i][j]==1 || a[i][j]==0){
            return ;
        }
        vis[i][j]=1;
        
        dfs(a,vis,i+1,j);
        dfs(a,vis,i-1,j);
        dfs(a,vis,i,j+1);
        dfs(a,vis,i,j-1);
        
        return;
    }
}
