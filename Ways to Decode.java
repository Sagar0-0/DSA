public class Solution {
    int mod=1000000007;
    public int numDecodings(String s) {
        int n = s.length();
        int[]dp=new int[n+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for(int i=2; i<=n; i++) {
            int ways = 0;
            String dig = s.substring(i-1,i);
            if(Integer.parseInt(dig) > 0) {
                ways += dp[i-1];
                ways %= mod;
            }
            dig = s.substring(i-2, i);
            if(Integer.parseInt(dig) >= 10 && Integer.parseInt(dig) <= 26) {
                ways += dp[i-2];
                ways %= mod;
            }
            dp[i] = ways;
        }
        return dp[n];
    }
}
