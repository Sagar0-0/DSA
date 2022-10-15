/*
We define the state dp[i][j]: The best solution for the first i chars in the string after at most j chars
being removed; i.e., the minimum length after at most j chars being removed from s.substring(0, i).

For each such substring, we can either delete or keep the last char, s[i - 1]
- To delete, dp[i][j] = dp[i - 1][j - 1].
- To keep, we delete at most j chars in s.substring(0, i) that are different from the last character.
- We then take the min value of them for dp[i][j]
*/
class Solution {
    public int getLengthOfOptimalCompression(String s, int k) {
        int n = s.length();
        
        // dp[i][j]: the minimum length for the first i chars after at most j chars being removed.
        int[][] dp = new int[n + 1][k + 1];
        // Initialize each cell of the dp 2-D array to n, the max value that each cell can have. This
        // is OK, as each dp[i][j] will have the min value bewteen dp[i][j] and its calculate value.
        // for (int[] i : dp) Arrays.fill(i, n); // this is a bit slower (100ms)
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                dp[i][j] = n;
            }
        }
		
        // Minimum length of empty string after 0 removal is 0
        dp[0][0] = 0;
        
        // iterate from 1 character substring to n-character substring
        for(int i = 1; i <= n; i++) {
            // We can delete at most i characters if i < k or k characters if i >= k.
            // Using "j <= k" alone here is OK but "j <= i && j <= k" speeds up a lot
            for(int j = 0; j <= i && j <= k; j++) {                
                int count = 0;
                int del = 0;
                
                // delete the last character of the substring (j has to be greater than 1 to delete 1 character)
                if (j > 0) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                
                // Keep the last character of the substring, and starting from the end of the 
                // substring, count the same characters as the last character, and remove characters
                // that are different.
                char lastChar = s.charAt(i - 1);
                for(int p = i; p >= 1; p--) { 
                    if (s.charAt(p - 1) == lastChar) {
                        count++;
                    } else {
                        del++;
                        
                        // Bail out if no more removal is available
                        if (del > j) {
                            break;
                        }
                    }
                    
                    // After del number of removals from the end of substring we have "p - 1" characters left
                    // in the substring and AT MOST "j - del" removals available
                    dp[i][j] = Math.min(dp[i][j], dp[p - 1][j - del] + 1 + length(count));
                }
            }
        }
        
        return dp[n][k];
    }
    
    // Constraints is "1 <= s.length <= 100", then the max count is 100 when all 100 characters are the same
    // Note we don't add '1' after single characters.
    private int length(int count) {
        return count == 100 ? 3 : count >= 10 ? 2 : count > 1 ? 1 : 0;
    }
}