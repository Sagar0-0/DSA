class Solution {
    public int countVowelPermutation(int N) {
        int mod=(int)Math.pow(10,9)+7;
        int[][]dp=new int[5][N+1];
        for(int i=0;i<5;i++){
            dp[i][1]=1;
        }
        for(int n=2;n<=N;n++){
            dp[0][n]= ((dp[1][n-1]+dp[2][n-1])%mod +dp[4][n-1])%mod;
            dp[1][n]= (dp[0][n-1]+dp[2][n-1])%mod;
            dp[2][n]= (dp[1][n-1]+dp[3][n-1])%mod;
            dp[3][n]= dp[2][n-1];
            dp[4][n]=(dp[2][n-1]+dp[3][n-1])%mod;
        }
        return ( ((dp[0][N]+dp[1][N])%mod + (dp[2][N]+dp[3][N])%mod)%mod +dp[4][N] )%mod;
    }
}