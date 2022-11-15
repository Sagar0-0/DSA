class Solution {
    public static int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for(String str : strs){
            int one = 0;
            int zero = 0;
            for(char c : str.toCharArray()){
                if(c == '1')
                    one++;
                else
                    zero++;
            }
            for(int i = m; i >= zero; i--){
                for(int j = n; j >= one; j--){
                    if(one <= j && zero <= i)
                        dp[i][j] = Math.max(dp[i][j],dp[i - zero][j - one] + 1);
                }
            }
        }
        return dp[m][n];
    }
}