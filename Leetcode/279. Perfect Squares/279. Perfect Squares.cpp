class Solution {
    int solve(int ind, vector<int> &nums, int tar, vector<vector<int>> &dp)
    {
        if(tar == 0) 
            return 0;
        
        if(ind == 0)
             return tar; 
        
        
        if(dp[ind][tar] != -1) return dp[ind][tar];
        
        int excl = solve(ind-1, nums, tar, dp);
        int incl = 1e9;
        if(nums[ind] <= tar)
            incl = 1 + solve(ind, nums, tar-nums[ind], dp);
        
        return dp[ind][tar] = min(excl, incl);
    }
public:
    int numSquares(int n) {
        
        if(n <= 3) return n;
        
        vector<int> nums;
        
        for(int i = 1; i*i <= n; i++)
        {
            nums.push_back(i*i);
            
        }
        int m = nums.size();
        
        vector<vector<int>> dp(m+1, vector<int>(n+1, -1));  //n is target
        
        return solve(m-1, nums, n , dp);
    }
};
