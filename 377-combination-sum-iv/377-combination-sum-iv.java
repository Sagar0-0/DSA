class Solution {
    private int[] dp;

    public int combinationSum4(int[] nums, int target) {
        dp = new int[target + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        return helper(nums, target);
    }

    private int helper(int[] nums, int target) {
        if (dp[target] != -1) 
            return dp[target];

        int res = 0;
        for (int num: nums) {
            if (target >= num) {
                res += helper(nums, target - num);
            }
        }
        return dp[target] = res;
        // res;
    }
}