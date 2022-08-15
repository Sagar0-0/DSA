class Solution {
public:


// This problem comes under the category of partition dp.

    int mergeStones(vector<int> &stones, int k)
{
    int n = stones.size();
    
    // Condition to check if it's possible to merge all piles of stones into a single pile
    if ((n - 1) % (k - 1) != 0)
        return -1;
    vector<int> prefixSum(n + 1);
    prefixSum[0] = 0;
    prefixSum[1] = stones[0];
    for (int i = 2; i <= n; i++)
    {
        prefixSum[i] = prefixSum[i - 1] + stones[i - 1];
    }
    vector<vector<int>> dp(n, vector<int>(n, 0));
    for (int i = n - 1; i >= 0; i--)
    {
        for (int j = i+1; j <= n - 1; j++)
        {
            int mini = 1e9;
            for (int idx = i; idx < j; idx = idx + k - 1)
            {
                int cost =  dp[i][idx] + dp[idx + 1][j];
                mini = min(cost, mini);
            }
                 if((j-i)%(k-1) == 0){
                    mini += prefixSum[j+1] - prefixSum[i];
                }
             dp[i][j] = mini;
        }
    }
    return dp[0][n - 1];
}

};
