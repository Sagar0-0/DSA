class Solution {
    
    // Most optimized solution
    
    public int subarraysDivByK(int[] nums, int k) {
        int prefix_sum=0,n=nums.length,ans=0;   
        
        int [] rem = new int [k];  //storing occurences of remainders
        
        rem[0]=1;
        
        for(int i=0;i<n;i++){
            prefix_sum+= nums[i];
            int idx = (prefix_sum % k + k) % k;  // since values can be negative as well
            ans+= rem[idx];  // ye line yahi likhi jayegi note
            rem[idx]++;
        }
        return ans;
    }
}