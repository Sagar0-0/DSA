public class Solution {
    int[][]dp;
    public int solve(int[][] A) {
        int n=A.length;
        dp=new int[n][n];
        for(int i=0;i<n;i++){
            dp[n-1][i]=A[n-1][i];
        }
        return solve(A,0,0);
    }
    public int solve(int[][]arr,int i,int j){
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        int max=arr[i][j]+Math.max(solve(arr,i+1,j),solve(arr,i+1,j+1));
        dp[i][j]=max;
        return max;
    }
}
