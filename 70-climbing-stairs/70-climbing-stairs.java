class Solution {
    public int climbStairs(int n) {
        
        int dp[] = new int[n+1];
        dp[n] = 1;
        for(int i = n; i>=0; i--){
            if(i+1<=n){
                dp[i] = dp[i+1];
            }
            if(i+2<=n){
                dp[i] = dp[i+1] + dp[i+2];
            }
        }
        
        return dp[0];
    }
}