class Solution {
    int []dp;
    public int climbStairs(int n) {
        dp=new int[n+1];
        return dfs(n);
    }
    int dfs(int n){
        if(n<=2)return n;
        if(dp[n]!=0)return dp[n];
        return dp[n]=dfs(n-1)+dfs(n-2);
    }
}