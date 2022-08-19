#include <bits/stdc++.h>
using namespace std;

int solve(vector<vector<int>> &dp, string &s, int i , int j)
{
    int num = 0 , flag = 1;
    for(int k = i;k<=j;k++)
    {
        num *= 10;
        num += (s[k] - '0');
        if(s[k] == '*' || s[k] == '+')
        {
            flag = 0;
        }
    }
    
    if(flag) return num;
    
    if(dp[i][j] != -1)
    {
        return dp[i][j];
    }
    
    int temp = INT_MIN;
    for(int k = i;k<=j;k++)
    {
        if(s[k] == '*')
        {
            temp = max(temp , (solve(dp , s , i , k-1) * solve(dp , s , k+1 , j)));
        }
        else if(s[k] == '+')
        {
            temp = max(temp , (solve(dp , s , i , k-1) + solve(dp , s , k+1 , j)));
        }
    }
    
    return dp[i][j] = temp;
}
int main() 
{
    int t;
    cin >> t;
    while(t--)
    {
        string str;
        cin >> str;
        int n = str.length();
        vector<vector<int>> dp(n , vector<int>(n ,-1));
        solve(dp , str , 0 , n-1);
        cout << dp[0][n-1] << endl;
    }
	return 0;
}
