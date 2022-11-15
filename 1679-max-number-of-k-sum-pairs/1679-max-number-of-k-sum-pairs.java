class Solution {
    public int maxOperations(int[] nums, int k) {
        int ans=0;
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum==k){
                ans++;
                i++;
                j--;
            }else if(sum<k){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}