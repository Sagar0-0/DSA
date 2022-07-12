// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
class Solution {
  public:
      int findShortest(vector<vector<int>> &dp, string &S, string &T, int n, int m, int i, int j){
        if(i >= n){
            return 501;
        }
        if(j >= m){
            return 1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int k = j;
        for(; k < m; k++){
            if(S[i] == T[k]){
                break;
            }
        }
        if(k == m){
            return 1;
        }
        return dp[i][j] = min(findShortest(dp, S, T, n, m, i + 1, j), 1 + findShortest(dp, S, T, n, m, i + 1, k + 1));
    }
  
  
    int shortestUnSub(string S, string T) {
        int n = S.size();
        int m = T.size();
        vector<vector<int>> dp (n + 1, vector<int> (m + 1, -1));
        int ans = findShortest(dp, S, T, n, m, 0, 0);
        return ans >= 501 ? -1 : ans;
    }
};

// { Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        string S,T;
        cin>>S>>T;

        Solution ob;
        cout << ob.shortestUnSub(S,T) << endl;
    }
    return 0;
}  // } Driver Code Ends