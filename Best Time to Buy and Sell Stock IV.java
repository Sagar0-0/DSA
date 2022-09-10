class Solution {
    public int maxProfit(int k, int[] prices) {
        int [][][]dp=new int[k+1][prices.length+1][2];
        for(int i=0;i<dp.length;i++) {
            for(int j=0;j<dp[0].length;j++) {
                for(int m=0;m<dp[0][0].length;m++) dp[i][j][m]=-1;
            }
        }
        return maximumProfit(prices, k, 0, 0, dp);
    }
    public int maximumProfit(int[] prices, int k, int ind, int buy, int [][][]dp) {
        if(ind>=prices.length) return 0;
        if(k==0) return 0;
                
        if(dp[k][ind][buy]!=-1) {
            return dp[k][ind][buy];
        }
        int ans1=0, ans2=0, ans3=0, ans4=0;
        if(buy==0) {
            ans1=maximumProfit(prices, k, ind+1, buy, dp); //not buying in this index and continuing
            ans2=-prices[ind]+maximumProfit(prices, k, ind+1, 1, dp); //buying at this index by passing 1 by subtracting the current amount and continuing
        }
        else {
            ans3=maximumProfit(prices, k, ind+1, buy, dp);  //not selling at this index and continuing
            ans4=(prices[ind])+maximumProfit(prices, k-1, ind+1, 0,  dp); //selling at this index by adding current index amount and reducing transactions by 1 and continuing
        }
        return  dp[k][ind][buy]=Math.max(ans1, Math.max(ans2, Math.max(ans3, ans4))); // taking maximum of all these combinations
        
    }
}
