class Solution {
    
    static final int MAX_COST = 1000001;
    
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        // dp(i, j, k): house, color, group
        int[][][] dp = new int[m][n][target]; 
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < target; k++) {
                    dp[i][j][k] = MAX_COST;
                }
            }
        }
         
        if (houses[0] == 0) {
            for (int j = 0; j < n; j++) {
                dp[0][j][target - 1] = cost[0][j];
            } 
        } else {
            int j = houses[0] - 1;
            dp[0][j][target - 1] = 0;
        }
        
        
        int lr = target - 1;
        
        for (int i = 1; i < m; i++) {
            int hr = m - i;
            if (hr >= target) {
                hr = target - 1;
            }
            
            if (houses[i] > 0) {
                int j = houses[i] - 1;
                for (int remaining = hr; remaining >= lr; remaining--) {
                    // not change
                    dp[i][j][remaining] = Math.min(dp[i][j][remaining], dp[i - 1][j][remaining]);
                    
                    // change
                    if (houses[i - 1] > 0 && houses[i - 1] - 1 != j) {
                        dp[i][j][remaining - 1] = Math.min(dp[i][j][remaining - 1], dp[i - 1][houses[i - 1] - 1][remaining]);
                    } else {
                        dp[i][j][remaining - 1] = Math.min(dp[i][j][remaining - 1], min(dp[i - 1], j, remaining));
                    }
                }
                
                if (lr == 1) {
                    dp[i][j][0] = Math.min(dp[i][j][0], dp[i - 1][j][0]);
                }
            } else {
                for (int j = 0; j < n; j++) {
                    for (int remaining = hr; remaining >= lr; remaining--) {
                        // not change
                        int a = dp[i - 1][j][remaining];
                        int b = cost[i][j];
                        dp[i][j][remaining] = Math.min(dp[i][j][remaining], dp[i - 1][j][remaining] + cost[i][j]);

                        // change
                        if (houses[i - 1] > 0 && houses[i - 1] - 1 != j) {
                            dp[i][j][remaining - 1] = Math.min(dp[i][j][remaining - 1], dp[i - 1][houses[i - 1] - 1][remaining] + cost[i][j]);
                        } else {
                            dp[i][j][remaining - 1] = Math.min(dp[i][j][remaining - 1], min(dp[i - 1], j, remaining) + cost[i][j]);
                        }
                    }

                    if (lr == 1) {
                        dp[i][j][0] = Math.min(dp[i][j][0], dp[i - 1][j][0] + cost[i][j]);
                    }
                }
            }
            
            if (lr > 1) {
                lr--;
            }
        }
        
        int min = dp[m - 1][0][0];
        for (int j = 1; j < n; j++) {
            if (dp[m - 1][j][0] < min) {
                min = dp[m - 1][j][0];
            }
        }

        return min < MAX_COST ? min : -1;
    }
    
    private int min(int[][] minCost, int j, int remaining) {
        int min = Integer.MAX_VALUE;
        for (int k = 0; k < minCost.length; k++) {
            if (k != j && minCost[k][remaining] < min) {
                min = minCost[k][remaining];
            }
        }
        
        return min;
    }
    
}