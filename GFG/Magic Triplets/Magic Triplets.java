class Solution{
    public int countTriplets(int[] nums){
        // code here
        int ans=0;
        int n=nums.length;
        for(int j=1;j<n-1;j++){
            int smaller=0;
            for(int i=j-1;i>=0;i--){
                if(nums[i]<nums[j])smaller++;
            }
            int larger=0;
            for(int k=j+1;k<n;k++){
                if(nums[k]>nums[j])larger++;
            }
            ans+=smaller*larger;
        }
        return ans;
    }
}
