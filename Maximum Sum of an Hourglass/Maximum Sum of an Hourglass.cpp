class Solution {
public:
    int maxSum(vector<vector<int>>& grid) {
        int r = grid.size(), c = grid[0].size();
        
        int sum = 0, max_sum = 0;
        
        for(int i = 0; i <= r - 3; i++){
            for(int j = 0; j <= c - 3; j++){
                sum = (grid[i][j] + grid[i][j + 1] + grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2]);
                
                max_sum = max(sum, max_sum);
            }
        }
        
        return max_sum;
    }
};
