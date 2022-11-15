public class Solution {
    public int numDistinct(String s1, String s2) {
        char[]A=s1.toCharArray();
        char[]B=s2.toCharArray();
        int n = A.length, m = B.length;
        int [][]dp=new int[n+1][m+1];
        for(int i = 0 ; i <= n ; i++)
            dp[i][0]=1;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= m ; j++){
                if(A[i-1] == B[j-1])
                    dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][m];
    }
}
