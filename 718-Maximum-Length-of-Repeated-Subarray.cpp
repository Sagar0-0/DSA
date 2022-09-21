int findLength(vector<int>& nums1, vector<int>& nums2) 
    {
        int n=nums1.size();
        int m=nums2.size();
        //INITIALIZATION
        vector<vector<int>>dp(n+1,vector<int>(m+1));
        for(int i=0;i<n;++i)
            for(int j=0;j<m;++j)
                if(i==0||j==0)
                    dp[i][j]=0;
        ////////////
        //MAIN LOGIC
        for(int i=1;i<=n;++i)
            for(int j=1;j<=m;++j)
            {
                if(nums1[i-1]==nums2[j-1])//IF CONTINIOUS, add 1 to previous
                    dp[i][j]=dp[i-1][j-1]+1;
                else //IF DISCONTINIOUS,then 0
                    dp[i][j]=0;
            }
        //FINDING THE MAXIMUM LENGTH FROM DP MATRIX
        int maxi=INT_MIN;
        for(int i=0;i<=n;++i)
            for(int j=0;j<=m;++j)
                maxi=max(maxi,dp[i][j]);
        return maxi;
    }
