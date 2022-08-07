class Solution {
    public int countVowelPermutation(int n) {
        int mod=(int)Math.pow(10,9)+7;
        int[][]dp=new int[5][n+1];
        for(int i=0;i<5;i++){
            dp[i][1]=1;
        }
        for(int level=2;level<=n;level++){
            dp[0][level]= ((dp[1][level-1] + dp[2][level-1])%mod +dp[4][level-1])%mod;
            dp[1][level]= (dp[0][level-1] + dp[2][level-1])%mod;
            dp[2][level]= (dp[1][level-1] + dp[3][level-1])%mod;
            dp[3][level]=dp[2][level-1];
            dp[4][level]=(dp[2][level-1] + dp[3][level-1])%mod;
        }
        return (((dp[0][n]+dp[1][n])%mod +(dp[2][n]+dp[3][n])%mod)%mod +dp[4][n])%mod;
    }
}