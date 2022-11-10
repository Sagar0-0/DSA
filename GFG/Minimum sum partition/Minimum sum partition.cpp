class Solution {
public:
   int count_subset(vector<int>a,int sum,int n){
      int dp[n+1][sum+1];
    for(int i=0;i<=n;i++){
        for(int j=0;j<=sum;j++){
            if(i==0)
            dp[i][j]=false;
            if(j==0)
            dp[i][j]=true;
        }
    }            

    for(int i=1;i<=n;i++){
        for(int j=0;j<=sum;j++){
            if(a[i-1]<=j){
                dp[i][j]=dp[i-1][j] || dp[i-1][j-a[i-1]];
            }
            else
            dp[i][j]=dp[i-1][j];
        }
    }

      int minm=INT_MAX;
    for(int i=1;i<sum+1;i++)
    {
        if(dp[n][i]==true)
        {         
            minm=min(minm,abs(i-(sum-i)));
        }
    } 

return minm;
}

    int minimumDifference(vector<int>& nums) {
        if(nums.size()==2)
            return abs(nums[0]-nums[1]);
        else{
        int sum=0;
        for(int i=0;i<nums.size();i++){
            sum+=nums[i];
        }
        return count_subset(nums,abs(sum),nums.size());
        }
    }
};
