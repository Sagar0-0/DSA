class Solution
{
public:
    int mod = 1000000007;
    int dp[1000][1000];
    long long int solve(string &s, int i, int j)
    {
        if (i > j)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        if (i == j)
            return dp[i][j] = 1;
        else if (s[i] == s[j])
            return dp[i][j] = (solve(s, i + 1, j) + solve(s, i, j - 1) + 1) % mod;
        else
            // since we are substracting one value here which can cause -ve value so to overcome
            // that we are adding mod here.
            // because it won't affect the answer but our final answer won't be -ve anymore
            return dp[i][j] = (mod + solve(s, i + 1, j) + solve(s, i, j - 1) - solve(s, i + 1, j - 1)) % mod;
    }
    /*You are required to complete below method */
    long long int countPS(string str)
    {
        // Your code here
        int N = str.length();
        memset(dp, -1, sizeof(dp));
        return solve(str, 0, N-1);
    }
};
