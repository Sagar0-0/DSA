class Solution {
  public:
    int maxGroupSize(int arr[], int N, int K) {
        vector<int>dp(K,0);
        for(int i=0;i<N;i++){
            int rem=arr[i]%K;
            dp[rem]+=1;
        }
        
        int ans=0;
        int i =1;
        int j =K-1;
        while(i<j){
            ans+=max(dp[i] , dp[j]);
            i++;
            j--;
            
        }
        if(i==j && dp[i]!=0)
            ans=ans+1;
         if(dp[0]>0)
            ans=ans+1;
            
            
            return ans;
        
    }   
        
    
};
