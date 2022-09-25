
#include <bits/stdc++.h>
using namespace std;

class Solution {
  public:
    vector<vector<int>> solveQueries(int n, vector<vector<int>> Queries) {
        vector<vector<int>> res(n,vector<int>(n,0));
        for(auto q:Queries){
            for(int row=q[0];row<=q[2];row++){
                res[row][q[1]]++;
                if(q[3]+1<n)res[row][q[3]+1]--;
                
            }
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                res[i][j]+=res[i][j-1];
            }
        }
        return res;
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
