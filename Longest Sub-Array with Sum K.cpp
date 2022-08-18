class Solution{
    public:
    int lenOfLongSubarr(int A[],  int N, int K) 
    { 
        // Complete the function
        map<int,int> mp;
        mp.insert({0,-1});
      
        int ans = 0, sum = 0;
        
        for(int i=0; i<N; i++)
        {
            sum += A[i];
            
            if(mp.find(sum-K) != mp.end())
            ans = max(ans, (i-mp[sum-K]));
            
            if(mp.find(sum) == mp.end())
            mp[sum] = i;
        }
        
        return ans;
    } 
  
};
