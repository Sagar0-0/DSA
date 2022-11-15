class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean dp[][] = new boolean[n][n];
        int start = 0,end = 0;
        
        for(int gap = 0;gap < n;gap++){
            for(int i = 0,j = gap;i< n && j < n;i++,j++){
                if(gap == 0){
                    dp[i][j] = true;
                }else if(gap == 1){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }
                if(dp[i][j] == true){
                    if(j-i > end - start){
                        start = i;
                        end = j;
                    }
                }
            }
        }
		
        return s.substring(start,end + 1);
    }
}