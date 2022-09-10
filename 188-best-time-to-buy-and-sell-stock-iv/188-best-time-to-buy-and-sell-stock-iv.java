class Solution {
    public int maxProfit(int k, int[] prices) {
        int[][][] dp = new int[k+1][prices.length][2];
        return f(k,0,prices,false,dp);
    }
    private int f(int k, int day, int[] prices, boolean stock_in_hand,int[][][] dp){
        if(day==prices.length || k==-1) return 0;
        int s = (stock_in_hand)?1:0;
        if(dp[k][day][s]!=0) return dp[k][day][s];
        if(s==1) return dp[k][day][s] = Math.max(prices[day]+f(k,day+1,prices,false,dp),f(k,day+1,prices,true,dp));
        else return dp[k][day][s] = Math.max(f(k-1,day+1,prices,true,dp)-prices[day],f(k,day+1,prices,false,dp));
    }
}