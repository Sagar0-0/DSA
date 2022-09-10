class Solution {
 
            
     public int maxProfit(int k, int[] prices) {
        return DP(prices, k);
    }
    
    private int DP(int[] prices, int k) {
        int[] costs = new int[k+1];
        int[] profits = new int[k+1];
        //costs[0] = prices[0];
        Arrays.fill(costs, Integer.MAX_VALUE);
        
        for (int currentPrice : prices) {
            for (int i = 0; i < k; i++) {
                costs[i+1] = Math.min(costs[i+1], currentPrice - profits[i]);
                profits[i+1] = Math.max(profits[i+1], currentPrice - costs[i+1]);
            }
        }
        
        return profits[k];
            
    }
}