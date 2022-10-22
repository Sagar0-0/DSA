class Solution {
  public:
    int fillingBucket(int N) {
        // code here
        
         if(N<4) return N;
         
        long long mod=1e8;
        vector<long long> dp(N+1);
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=N;i++)
            dp[i]=(dp[i-1]+dp[i-2])%mod;
        return dp[N];
    }
};
