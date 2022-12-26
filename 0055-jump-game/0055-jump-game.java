class Solution {
    byte[][]dp;
    public boolean canJump(int[] nums) {
        int max=0;
        for(int i:nums)max=Math.max(max,i);
        dp=new byte[nums.length][max+1];
        return dfs(0,nums);
    }
    boolean dfs(int i,int nums[]){
        if(i==nums.length-1)return true;
        if(nums[i]==0)return false;
        int num=nums[i];
        if(dp[i][num]>0){
            if(dp[i][num]==1)return false;
            else return true;
        }
        while(num>0){
            if(i+num<nums.length){
                if(dfs(i+num,nums)){
                    dp[i][nums[i]]=2;
                    dp[i][num]=2;
                    return true;
                }else{
                    dp[i][nums[i]]=1;
                    dp[i][num]=1;
                }
            }
            num--;
        }
        return false;
    }
    
}