// problem is a combination of 2 problems first is max sum of rectangle and second is sum of subarray not greater than k
class Solution {
public:
    int maxSumSubmatrix(vector<vector<int>>& mat, int k) {
        int row = mat.size();
        int col = mat[0].size();
        int maxLen=INT_MIN;
        for(int left = 0; left < col; left++){
            vector<int> v(row, 0);     
            for(int right = left; right < col; right++){
                for(int i = 0; i < row; i++){
                    v[i] += mat[i][right];                    
                }
                set<int> s = {0};
                int run_sum=0;
                for(int sum : v){
                    run_sum += sum;
                    auto it = s.lower_bound(run_sum - k);
                    if(it != s.end())
                        maxLen = max(maxLen, run_sum - *it);                    
                    s.insert(run_sum);
                }
            }
        }
        return maxLen;
    }
};
