class Solution{
    public:
    int ans = 0;
    bool isSafe(int i,int j,int m,int n,int x,vector<vector<char>> &mat,string &target)
    {
        if(i < 0 || j < 0 || i==m || j==n || x >= target.size() || mat[i][j] != target[x])
            return false;
        
        return true;
    }
    
    void solve(int i,int j,int m,int n,int x,vector<vector<char>> &mat,string &target)
    {
        if(isSafe(i,j,m,n,x,mat,target))
        {
            if(x == target.size()-1)
            {
                ans++;
                return;
            }
            
            int dx[4] = {1,-1,0,0};
            int dy[4] = {0,0,1,-1};
            char temp = mat[i][j];
            mat[i][j] = '/';
            for(int k=0; k<4; k++)
            {
                int nx = i+dx[k];
                int ny = j+dy[k];
               
                solve(nx,ny,m,n,x+1,mat,target);
               
            }
            mat[i][j] = temp;
            
        }
    }
    
    int findOccurrence(vector<vector<char> > &mat, string target){
        int m = mat.size();
        int n = mat[0].size();
        int x = 0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                solve(i,j,m,n,x,mat,target);
            }
        }
        return ans;
        
    }
};
