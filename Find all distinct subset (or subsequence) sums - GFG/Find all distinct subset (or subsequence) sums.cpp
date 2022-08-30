class Solution {
public:
    set<int> s;
    int dp[101][10001];
	vector<int> DistinctSum(vector<int>nums){
	    int n = nums.size();
	    memset(dp, -1, sizeof(dp));
	    solve(0, nums, n);
	    vector<int> ans;
	    for(auto& val: s) {
	        ans.push_back(val);
	    }
	    return ans;
	}
	void solve(int sum, vector<int>& nums, int n) {
	    if(n==0) {
	        s.insert(sum);
	        return;
	    }
	    if(dp[n][sum]==1) return;
	    solve(sum+nums[n-1], nums, n-1);
	    solve(sum, nums, n-1);
	    dp[n][sum] = 1;
	}
};