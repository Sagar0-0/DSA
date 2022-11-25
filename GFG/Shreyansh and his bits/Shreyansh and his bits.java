class Solution{
    long[][]dp;
    long count(long n)
    {
        dp=new long[64][64];
        for(int i=0;i<64;i++){
            Arrays.fill(dp[i],-1);
        }
        int ones=0;
        int positions=0;
        long ans=0;
        while(n>0){
            if((n&1)==1){
                ones++;
                ans+=nCr(positions,ones);
            }
            n=n>>1;
            positions++;
        }
        return ans;
    }
    long nCr(int n,int r){
        if(r>n){
            return 0;
        }
        if(r==0 || r==n)return 1;
        if(dp[n][r]!=-1)return dp[n][r];
        return dp[n][r]=nCr(n-1,r-1)+nCr(n-1,r);
    }
}
