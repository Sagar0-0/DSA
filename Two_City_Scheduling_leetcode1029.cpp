class Solution {
public:
    int twoCitySchedCost(vector<vector<int>>& costs) {
        int N = costs.size()/2;
        int ans = 0;
        sort(costs.begin(), costs.end(), [](vector<int> &v1, vector<int> &v2) {
                 return v1[0] - v1[1] < v2[0] - v2[1];
        });
        
        for(int i = 0; i < N; i++){
            ans += costs[i][0] + costs[i+N][1];
        }
        return ans;
    }
};
