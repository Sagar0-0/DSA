class Solution{
    public:
  
    // Function to return number of donuts prepared by R rank in T time
    int countDonut(int R, int T)
    {
        int cnt = 1;
        
        while(T-R*cnt >= 0)
        {
            T -= R*cnt;
            cnt++;
        }
        
        return cnt-1;
    }
    
    int findMinTime(int N, vector<int>&A, int L){
        //write your code here
        int ans = INT_MAX;
        int low = 0, high = INT_MAX;
        
        while(low <= high)
        {
            int mid = low + (high-low)/2;
            int cnt = 0;
            
            for(auto it : A)
            cnt += countDonut(it, mid);
            
            if(cnt >= N)
            {
                ans = mid;
                high = mid-1;
            }
            else
                low = mid+1;
        }
        
        return ans;
    }
};
