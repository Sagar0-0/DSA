class Solution{
    int mod=1000000007;
    public int FindWays(int n, int m, int[][] bl){
        int[][]arr=new int[n+1][m+1];
        for(int i=0;i<bl.length;i++){
            int x=bl[i][0];
            int y=bl[i][1];
            arr[x][y]=-1;
        }
        if(arr[1][1]==-1 || arr[n][m]==-1){
            return 0;
        }
        int[][]dp=new int[n+1][m+1];
        dp[1][1]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i!=1 || j!=1){
                    if(arr[i][j]==-1){
                        dp[i][j]=0;
                    }else{
                        int up=dp[i-1][j];
                        int left=dp[i][j-1];
                        dp[i][j]=up+left;
                    }
                }
            }
        }
        return dp[n][m]%mod;
    }
}
