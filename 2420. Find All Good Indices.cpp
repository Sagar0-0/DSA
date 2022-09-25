class Solution {
public:
    vector<int> goodIndices(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> increasing(n, 1) , decreasing(n, 1);
      // prefix non-increasing elements in nums
        for(int i = 1; i < n; i++){
            if(nums[i-1] >= nums[i]){
                decreasing[i] = 1 + decreasing[i-1];
            }
        }
//         for(auto x : decreasing) cout<<x<<" ";
//         cout<<"\n";
      
      // prefix non-decreasing elements in nums
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i+1] >= nums[i]) {
                increasing[i] = 1 + increasing[i + 1];
            }
        }
//         for(auto x : increasing) cout<<x<<" ";
//         cout<<"\n";
        vector<int> v;
        for(int i=k;i<n-k;i++){
            if(increasing[i+1] >= k and decreasing[i-1] >= k){
                v.push_back(i);
            }
        }
        return v;
    }
};
