class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=Integer.MAX_VALUE;
        ans[1]=Integer.MIN_VALUE;
        dfs(nums,target,ans,0,nums.length-1);
        if(ans[0]==Integer.MAX_VALUE){
            ans[0]=-1;
            ans[1]=-1;
        }
        return ans;
    }
    void dfs(int[]nums,int target,int[]ans,int l,int h){
        if(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                ans[0]=Math.min(ans[0],mid);
                ans[1]=Math.max(ans[1],mid);
                dfs(nums,target,ans,l,mid-1);
                dfs(nums,target,ans,mid+1,h);
            }else if(nums[mid]>target){
                dfs(nums,target,ans,l,mid-1);
            }else{
                dfs(nums,target,ans,mid+1,h);
            }
        }
    }
}