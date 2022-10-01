class Solution {
public:
    int maxSubArray(vector<int>& nums)
    {
        vector<int> memo(nums.size());

        memo[nums.size() - 1] = nums[nums.size() - 1];
        for (int i = nums.size() - 2;i >= 0; i--)
            memo[i] = max(nums[i], memo[i + 1] + nums[i]);
        return (*max_element(memo.begin(),memo.end()));
    }
};
