public class Solution {
    static int dp[][] = new int[501][501];
    Solution(){
        for(int row[]: dp)
            Arrays.fill(row,-1);
    }
    static public int minCut(String str) {
        return solve(str,0,str.length()-1);
    }
    
    static int solve(String str,int i,int j){
        if(i>=j)
            return dp[i][j] = 0;
        if(dp[i][j] != -1)
            return dp[i][j];
        if(isPalindrome(str,i,j))
            return 0;
        int min = Integer.MAX_VALUE;    
        for(int k=i;k<=j-1;k++){
            int left = 0,right = 0;
            if(dp[i][k] != -1)
                left = dp[i][k];
            else{
                left = solve(str,i,k);
                dp[i][k] = left;
            }
            if(dp[k+1][j] != -1)
                right = dp[k+1][j];
            else{
                right = solve(str,k+1,j);
                dp[k+1][j] = right;
            }
            int temp = right + left + 1;
            min = Math.min(min,temp);
        }
        return dp[i][j] = min;
    }
    static boolean isPalindrome(String str,int i,int j){
        String x = str.substring(i,j+1);
        int k=0,l=x.length()-1;
        while(k<l){
            if(x.charAt(k++) != x.charAt(l--))
                return false;
        }
        return true;
    }
}
