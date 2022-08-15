class Solution {
public:
    int minSwaps(vector<int>& nums) 
    {
        int n = nums.size();
        int k = 0 , ans = n;
        for(int i = 0;i<n;i++)
        {
            if(nums[i] == 1) k+=1;
        }
        
        int i = 0 , j = 0 , cnt0 = 0;
        for(j = 0;j<k;j++)
        {
            if(nums[j] == 0) cnt0 += 1;
        }
        j-=1;
        
        while(i < n)
        {
            ans = min(ans , cnt0);
            j = (j+1)%n;
            if(nums[j] == 0) cnt0 += 1;
            if(nums[i] == 0) cnt0 -= 1;
            i+=1;
        }
        ans = min(ans , cnt0);
        return ans;
    }
};
