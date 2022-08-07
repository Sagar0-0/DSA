class Solution {
    public int countVowelPermutation(int n) {
        int mod=(int)Math.pow(10,9)+7;
        int[]dp=new int[5];
        for(int i=0;i<5;i++){
            dp[i]=1;
        }
        for(int level=2;level<=n;level++){
            int a= ((dp[1]+ dp[2])%mod +dp[4])%mod;
            int e= (dp[0] + dp[2])%mod;
            int i= (dp[1] + dp[3])%mod;
            int o=dp[2];
            int u=(dp[2]+ dp[3])%mod;
            dp[0]=a;
            dp[1]=e;
            dp[2]=i;
            dp[3]=o;
            dp[4]=u;
        }
        return (((dp[0]+dp[1])%mod +(dp[2]+dp[3])%mod)%mod +dp[4])%mod;
    }
}