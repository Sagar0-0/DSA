public class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int sz=0;
        int asnI=0;
        int ansJ=0;
        boolean[][]dp=new boolean[n][n];
        for(int diff=0;diff<n;diff++){
            for(int i=0,j=i+diff;j<n;i++,j++){
                if(i==j){
                    dp[i][j]=true;
                }else if(diff==1){
                    dp[i][j]=(s.charAt(i)==s.charAt(j))?true:false;    
                }else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
                        dp[i][j]=true;
                    }
                }
                if(dp[i][j] && j-i+1>sz){
                    sz=j-i+1;
                    asnI=i;
                    ansJ=j+1;
                }
            }
        }
        return s.substring(asnI,ansJ);
    }
}
