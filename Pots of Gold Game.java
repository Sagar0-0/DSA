class GfG
{
	public static int maxCoins(int A[],int n)
	{
          //add code here.
          int[][]dp=new int[n+1][n+1];
          return dfs(A,0,n-1,dp);
    }
    static int dfs(int[]A,int i,int j,int[][]dp){
        if(i==j)return A[i];
        if(i+1==j)return Math.max(A[i],A[j]);
        if(dp[i][j]==0){
            int start=A[i]+Math.min(dfs(A,i+2,j,dp),dfs(A,i+1,j-1,dp));
            int end=A[j]+Math.min(dfs(A,i+1,j-1,dp),dfs(A,i,j-2,dp));
            dp[i][j]=Math.max(start,end);
        }
        return dp[i][j];
    }
}
