class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        if(n==0)return n;
        int ans=1;
        int[]dp=new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j] && dp[j]+1>dp[i]){
                    dp[i]=1+dp[j];
                }
                ans=Math.max(ans,dp[i]);
            }
        }
        return ans;
    }
}