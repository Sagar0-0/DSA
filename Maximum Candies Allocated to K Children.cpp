class Solution {
public:
    bool allocate(vector<int>& candies , long long k ,  int mid)
    {
        long long int sum = 0;
        for(int i = 0; i<candies.size() ; i++)
        {
            sum += candies[i]/mid;
        }
        if(sum >= k) return true;
        else return false;
    }
    int maximumCandies(vector<int>& candies, long long k) {
        long long int sum = 0;
        
        for(auto i:candies)
        {
            sum+=i;
            
        }

        long long int start = 1;
        long long int end = sum;
        long long int ans = 0;
        while(start<=end)
        {
            long long int mid = start+(end-start)/2;

            if(allocate(candies , k , mid)) 
            {
                ans = mid;
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return ans;
    }
};