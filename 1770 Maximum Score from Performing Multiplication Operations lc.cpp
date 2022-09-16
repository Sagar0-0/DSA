#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
     int m, n;
    int dfs(vector<int>& nums, vector<int>& mult, vector<vector<int>>& dp, int i, int j) {
        // i : *ptr at nums
        // j : *ptr at mult
        // if performed all oper, return 0
        if (j == m) return 0;
        // memoizated before - return the value here
        if (dp[i][j] != INT_MIN) return dp[i][j];
        return dp[i][j] = max(
            mult[j] * nums[i] + dfs(nums, mult, dp, i + 1, j + 1),
            mult[j] * nums[n - 1 - j + i] + dfs(nums, mult, dp, i, j + 1)
        ); 
    }
    int maximumScore(vector<int>& nums, vector<int>& multipliers) {
        n = (int) nums.size(), m = (int) multipliers.size();
		// init values that couldn't be reached. -1 will cause TLE. -2 would pass but it's not supposed to pass.
        vector<vector<int>> dp(m, vector<int>(m, INT_MIN));
        // or u can return dp[0][0] after running dfs
        return dfs(nums, multipliers, dp, 0, 0);
    }
};