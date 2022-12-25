class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n=queries.length;
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            int j=0;
            for(;j<nums.length;j++){
                if(sum+nums[j]>queries[i])break;
                sum+=nums[j];
            }
            ans[i]=j;
        }
        return ans;
    }
}