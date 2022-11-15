class Solution {
    
    Integer[][] dp;
    int n;
    
    public int Helper(int idx, int[] arr, int d){
        
        if(idx == n && d == 0)    return 0;
        if(n - idx < d)           return (int)1e5;          // only for optimization not necessary
        if(d < 0)                 return (int)1e5;
		
        if(dp[idx][d] != null)      return dp[idx][d];
        
        int max = 0;
        int res = Integer.MAX_VALUE;
        
        for(int i = idx; i < n; ++i){
            max = Math.max(arr[i], max);
            res = Math.min(res, max + Helper(i + 1, arr, d - 1));
        }
    
        return dp[idx][d] = res;
    }
    
    public int minDifficulty(int[] jobDifficulty, int d) {
        this.n = jobDifficulty.length;
		this.dp = new Integer[n][d + 1]; 
		
        if(n < d)   return -1;
       
        return Helper(0, jobDifficulty, d);
    }
}