class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        
        if(n == 1) return nums[0];
        
        int dp2=nums[0], dp1=Math.max(nums[0],nums[1]),dp=dp1;
        
        for(int i = 2; i < n; i++){
            dp = Math.max(dp1, dp2 + nums[i]);
            dp2 = dp1;
            dp1 = dp;
        }
        return dp;

    }
}