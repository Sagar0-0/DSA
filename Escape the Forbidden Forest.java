class Sol
{
    public static int build_bridges(String str1 , String str2)
    {
        int n1 = str1.length(), n2 = str2.length();
        int[][] dp = new int[n1+1][n2+1];
        for(int i=0; i<=n1; i++){
            for(int j=0; j<=n2; j++){
                if(i==0 || j==0)
                    dp[i][j] = 0;
                else if(str1.charAt(i-1)==str2.charAt(j-1))
                   dp[i][j] = 1 + dp[i-1][j-1];
                else
                   dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n1][n2];
    }
}
