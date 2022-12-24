class Solution {
    public int numTilings(int n) {
        int dp[] = new int[n+4];
        
        int mod = (int)(Math.pow(10,9)+7);
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        
        for(int i=4;i<=n;i++){
            dp[i] = ((2*dp[i-1])%mod)+dp[i-3];
            dp[i] %= mod;
        }
        
        return dp[n];
    }
}