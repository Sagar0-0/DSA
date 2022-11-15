class Solution {
    public int maxResult(int[] nums, int k) {
        
        int n = nums.length;
        int result = 0;
        
        if(k > n) {
            k = n;
        }
        
        if(k < 1) {
            for(int i = 0; i < n; i++) {
                result += nums[i];
            }
            return result;
        }
        
        
        int[] dp = new int[n];
        
        dp[0] = nums[0];
        
        for(int i = 1; i < n; i++) {
            dp[i] = Integer.MIN_VALUE;
        }
        
        int maxIndex = 0;
        
        for(int i = 1; i < n; i++) {
            if(maxIndex < i - k) {
                
                int max = Integer.MIN_VALUE;
                for(int j = maxIndex+1; j < n && j <= maxIndex+k; j++) {
                    if(max <= dp[j]) {
                        max = dp[j];
                        maxIndex = j;
                    }
                }
            }
            
            dp[i] = Math.max(nums[i] + dp[maxIndex], dp[i]);
            if(dp[i] >= dp[maxIndex]) {
                maxIndex = i;
            }
            
        }
        return dp[n-1];
    }
}