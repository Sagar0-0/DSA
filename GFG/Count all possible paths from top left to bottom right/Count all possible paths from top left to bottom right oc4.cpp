#include <bits/stdc++.h>
using namespace std;
class Solution {
  public:
        int mod = 1e9+7;
        long long int mem(int i, int j, int m, int n, vector<vector<long long int>> &dp){
            if(i== m-1 and j == n-1) return 1;
            if(i >=m or j >=n) return 0;
            if(dp[i][j]!=-1) return dp[i][j];
            return dp[i][j] = (mem(i+1,j,m,n, dp)+ mem(i,j+1,m,n,dp))%mod;
            
        };
    long long int numberOfPaths(int m, int n){
        // code here
        vector<vector<long long int>> dp(m, vector<long long int>(n,-1));
        return mem(0,0,m,n,dp)%mod;

    }
};
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, m;
        cin >> m >> n;
        Solution ob;
        cout<<ob.numberOfPaths(m,n)<<endl;
    }
    return 0;
}