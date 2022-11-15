public class Solution {
    int[][]dp;
    public int minPathSum(int[][] A) {
        int n=A.length;
        int m=A[0].length;
        dp=new int[n][m];
        return dfs(A,0,0);
    }
    public int dfs(int[][]A,int i,int j){
        if(dp[i][j]!=0)return dp[i][j];
        int ans=A[i][j];
        if(!valid(A,i+1,j) && valid(A,i,j+1)){
            ans+=dfs(A,i,j+1);
        }else if(valid(A,i+1,j) && !valid(A,i,j+1)){
            ans+=dfs(A,i+1,j);
        }else if(valid(A,i+1,j) && valid(A,i,j+1)){
            ans+=Math.min(dfs(A,i+1,j),dfs(A,i,j+1));
        }
        dp[i][j]=ans;
        return ans;
    }
    public boolean valid(int[][]A,int i,int j){
        int n=A.length;
        int m=A[0].length;
        if(i<0 || j<0 || i==n || j==m)return false;
        return true;
    }
}
