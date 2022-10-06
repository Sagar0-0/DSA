class Solution {
  public:
    long long int numberOfPaths(int m, int n){
        // code here
       
      vector<vector<long long int> > dp(m+1,vector<long long int> (n+1,1));
       
       
       
       for(int i=1; i<m; i++)
          for(int j=1; j<n; j++)
            {
                    
                    dp[i][j]=(dp[i-1][j]+dp[i][j-1])%1000000007;
                    
                
            }
  
       
       
       return dp[m-1][n-1];
       
    }
};
