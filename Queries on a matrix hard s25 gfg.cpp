#include <bits/stdc++.h>
using namespace std;

class Solution {
  public:
    vector<vector<int>> solveQueries(int n, vector<vector<int>> Queries) {
        // Code here
        vector<vector<int>>mat(n, vector<int> (n,0));
        
        for(auto e: Queries){
            int a,b,c,d;
            a = e[0]; b=e[1]; c=e[2]; d=e[3];
            
            mat[a][b] +=1;
            if(c <n-1) mat[c+1][b]-=1;
            if(d<n-1) mat[a][d+1]-=1;
            if(c<n-1 && d <n-1) mat[c+1][d+1]+=1;
        }
        
        for(int i =1; i<n; i++){
            for(int j =0; j<n; j++){
                mat[i][j]+= mat[i-1][j];
            }
        }
                for(int i =0; i<n; i++){
            for(int j =1; j<n; j++){
                mat[i][j]+= mat[i][j-1];
            }
        }
        return mat;
    }
};

int main() {
    int tc;
    cin >> tc;
    while (tc--) {
        int n, q;
        cin >> n >> q;
        vector<vector<int>> Queries;
        for (int i = 0; i < q; i++) {
            vector<int> cur(4);
            for (int j = 0; j < 4; j++) cin >> cur[j];
            Queries.push_back(cur);
        }
        Solution obj;
        vector<vector<int>> ans = obj.solveQueries(n, Queries);
        for (auto i : ans) {
            for (auto j : i) cout << j << " ";
            cout << "\n";
        }
    }
    return 0;
}
// } Driver Code Ends