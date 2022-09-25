EASY TO UNDERSTAND USING A FUNCTION....


class Solution {
  public:
    void traverse(int a, int b, int c, int d, vector<vector<int>> &ans){
        for(int i=a; i<=c; i++){
            for(int j=b; j<=d; j++){
                ans[i][j]++;
            }
        }
    }
    vector<vector<int>> solveQueries(int n, vector<vector<int>> Queries) {
        // Code here
        vector<vector<int>> ans(n, vector<int> (n, 0));
        int querySize = Queries.size();
        for(int i=0; i<querySize; i++){
            int a = Queries[i][0], b = Queries[i][1], c = Queries[i][2], d = Queries[i][3];
            traverse(a, b, c, d, ans);
        }
        return ans;
    }
};
