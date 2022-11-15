class Solution
{
    public int[] DistinctSum(int[] nums)
    {
        // Code here
        boolean[][]dp=new boolean[101][10001];
        Set<Integer> set=new HashSet<>();
        dfs(nums,0,0,set,dp);
        int[] ans=new int[set.size()];
        int i=0;
        for(int ele:set){
            ans[i]=ele;
            i++;
        }
        Arrays.sort(ans);
        return ans;
    }
    void dfs(int[]nums,int i,int sum,Set<Integer> set,boolean[][]dp){
        if(i==nums.length){
            set.add(sum);
            return;
        }
        if(dp[i][sum])return;
        dp[i][sum]=true;
        dfs(nums,i+1,sum,set,dp);
        dfs(nums,i+1,sum+nums[i],set,dp);
    }
}
