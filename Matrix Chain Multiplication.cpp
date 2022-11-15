class Solution{
public:
    int solve(vector<vector<int>> &dp, int arr[] , int i , int j)
    {
        if(i == j)
            return dp[i][j] = 0;
        if(dp[i][j] != -1)
            return dp[i][j];
         
        int mn = INT_MAX;   
        for(int k = i;k<j;k++)
        {
            mn = min(mn , solve(dp ,arr, i , k) + solve(dp ,arr, k+1 , j) + arr[i]*arr[k+1]*arr[j+1]);
        }
        
        return dp[i][j] = mn;   
    }
    int matrixMultiplication(int N, int arr[])
    {
        vector<vector<int>> dp(N-1 , vector<int>(N-1 , -1));
        solve(dp , arr , 0 , N-2);
        return dp[0][N-2];
        // code here
    }
};
