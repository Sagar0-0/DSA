 class Solution
{
    public long countFriendsPairings(int n) 
    {
       long mod = 1000000007;
       long[] dp = new long[n+1];
       return helper(n,dp,mod);
    }
    long helper(int n,long[] dp,long mod){
        if(n<=2) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n] = (helper(n-1,dp,mod) + ((n-1)*helper(n-2,dp,mod)))%mod;
    }
    
}   
