class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum=0;
        for(int i:nums){
            if((i&1)==0)sum+=i;
        }
        int[]ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            if((nums[queries[i][1]]&1)==0){
                sum-=nums[queries[i][1]];
            }
            nums[queries[i][1]]+=queries[i][0];
            if((nums[queries[i][1]]&1)==0){
                sum+=nums[queries[i][1]];
            }
            ans[i]=sum;
        }
        return ans;
    }
}