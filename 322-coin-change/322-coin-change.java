class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int coin:coins){
            for(int i=coin;i<=amount;i++){//<dp.length
                dp[i]=Math.min(dp[i],dp[i-coin]+1);
            }
        }
        return dp[amount]<=amount? dp[amount] : -1;
    }
}