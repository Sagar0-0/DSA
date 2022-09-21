// Using Memoization

public static int helper(int n, int[] dp) {
        if(n<=1) return dp[n] = 1;
        
        if(dp[n] != -1) {
            return dp[n];
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans += helper(i, dp) * helper(n-i-1, dp);
        }
        return dp[n] = ans;
    }
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(n, dp);  
    }

// Using Tabulation

public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i = 2; i <= n; i++) {
            for(int j =0; j < i; j++) {
                dp[i] += (dp[j] * dp[i-j-1]);
            }
        }
        return dp[n];  
    }
