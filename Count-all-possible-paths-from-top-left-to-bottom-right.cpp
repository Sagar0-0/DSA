class Solution 
{
  public:
    long long mod=1e9+7;
    long long int numberOfPaths(int n, int m)
    {
        vector<vector<long long>>dp(n,vector<long long>(m));
        for(long long i=0;i<n;++i)
            for(long long j=0;j<m;++j)
                if(i==n-1 || j==m-1)
                    dp[i][j]=1;
        for(long long i=n-2;i>=0;i--)
            for(long long j=m-2;j>=0;j--)
                dp[i][j]=(dp[i+1][j]+dp[i][j+1])%mod;
        
        return dp[0][0];
        
    }
};
