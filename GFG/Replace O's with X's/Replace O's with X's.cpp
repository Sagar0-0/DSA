class Solution{
public:
 int delrow[4]={-1,0,1,0};
 int delcol[4]={0,-1,0,1};
    void dfs(int r,int c,vector<vector<int>> &vis,int n,int m,vector<vector<char>> &grid)
    {
        vis[r][c]=1;
        for(int i=0;i<4;i++){
            int nr=r+delrow[i];
            int nc=c+delcol[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && !vis[nr][nc] && grid[nr][nc]=='O'){
                dfs(nr,nc,vis,n,m,grid);
            }
        }
    }
    vector<vector<char>> fill(int n, int m, vector<vector<char>> grid)
    {
        vector<vector<int>> vis(n,vector<int>(m,0));
        for(int j=0;j<m;j++){
            if(!vis[0][j] && grid[0][j]=='O'){
                dfs(0,j,vis,n,m,grid);
            }
            if(!vis[n-1][j] && grid[n-1][j]=='O'){
                  dfs(n-1,j,vis,n,m,grid);
            }
        }
        
        for(int i=0;i<n;i++){
            if(!vis[i][0] && grid[i][0]=='O'){
                dfs(i,0,vis,n,m,grid);
            }
            if(!vis[i][m-1] && grid[i][m-1]=='O'){
                dfs(i,m-1,vis,n,m,grid);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j]=='O'){
                    grid[i][j]='X';
                }
            }
        }
        
        return grid;
    }
};
