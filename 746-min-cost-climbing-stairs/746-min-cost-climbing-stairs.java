class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[]dp=new int[n];
        return Math.min(dfs(n-1,dp,cost),dfs(n-2,dp,cost));
    }
    int dfs(int i,int[]dp,int[]cost){
        if(i<0)return 0;
        if(i==0){
            dp[i]=cost[i];
            return dp[i];
        }
        if(dp[i]!=0)return dp[i];
        return dp[i]=cost[i]+Math.min(dfs(i-1,dp,cost),dfs(i-2,dp,cost));
    }
}