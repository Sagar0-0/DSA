class Solution {
    static int MOD = (int)1e9 + 7;
    int helper(int n,int t,int k,int dp[][]){
        if(n < 0 || t < 0) return 0;
        if(n == 0 && t == 0) return 1;
        if(dp[n][t] != -1) return dp[n][t];
        int c_ans = 0;
        for(int i = 1;i <= k;i++){
            c_ans = (c_ans + helper(n - 1,t - i,k,dp)) % MOD;
        }
        return dp[n][t] = c_ans;
    }
    public int numRollsToTarget(int n, int k, int target) {
        int dp[][] =  new int[n + 1][target + 1];
        for(var a:dp) Arrays.fill(a,-1);
        return helper(n,target,k,dp);
    }
}