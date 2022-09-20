public class Solution {
    public int solve(String A) {
        int n=A.length();
        int[][]dp=new int[n+1][n+1];
        for(int i=0;i<A.length();i++){
            dp[i][i]=1;
        }
        for(int i=0;i<A.length()-1;i++){
            if(A.charAt(i)==A.charAt(i+1)){
                dp[i][i+1]=2;
            }else{
                dp[i][i+1]=1;
            }
        }
        for(int gap=3;gap<=A.length();gap++){
            for(int i=0,j=i+gap-1;j<A.length();i++,j++){
                if(A.charAt(i)==A.charAt(j)){
                    dp[i][j]=2+dp[i+1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return dp[0][A.length()-1];
    }
}
