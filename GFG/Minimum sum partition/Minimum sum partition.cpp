class Solution{

  public:
	int minDifference(int arr[], int n)  { 
	    // Your code goes here
	       int sum=0;
       for(int i=0;i<n;i++)
       {
           sum+=arr[i];
       }
       int k=sum;
       vector<vector<bool>>dp(n,vector<bool>(k+1,0));
       for(int i=0;i<n;i++)
       {
           dp[i][0]=1;
       }
       if(arr[0]<=k)
       {
           dp[0][arr[0]]=true;
       }
       for(int index=1;index<n;index++)
       {
           for(int target=1;target<=k;target++)
           {
               bool notake=dp[index-1][target];
               bool take=false;
               if(arr[index]<=target)
                   take=dp[index-1][target-arr[index]];
               dp[index][target]=take|notake;
              
           }
       }
       int mini=1e9;
       for(int s1=0;s1<=(sum/2);s1++)
       {
           if(dp[n-1][s1]==true)
           {
               mini=min(mini,abs((sum-s1)-s1));
           }
       }
       return mini;
	} 
};
