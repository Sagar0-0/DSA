class Solution{
    static long mod=1000000007;
    static int knots(int M, int N, int K){
        // code here
        long [][]dp=new long[1001][1001];
        long a=comb(M,K,dp);
        long b=comb(N,K,dp);
        return (int)((a%mod * b%mod )%mod);
    }
    static long comb(int n,int k,long[][]dp){
        if(k==0 || k==n)return 1;
        if(dp[n][k]!=0)return dp[n][k];
        dp[n][k]=(comb(n-1,k,dp)%mod + comb(n-1,k-1,dp)%mod)%mod;
        return dp[n][k];
    }
}
