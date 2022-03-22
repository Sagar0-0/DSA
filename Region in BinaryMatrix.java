public class Solution {
    int[][]arr;
    boolean[][]vis;
    public int solve(int[][] A) {
        arr=A;
        int n=A.length;
        int m=A[0].length;
        vis=new boolean[n][m];
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(A[i][j]==1 && vis[i][j]==false){
                    int curr=dfs(i,j);
                    ans=Math.max(ans,curr);
                }
            }
        }
        return ans;
    }
    public int dfs(int i,int j){
        if(i<0 || j<0)return 0;
        if(i==arr.length || j==arr[0].length)return 0;
        if(arr[i][j]==0)return 0;
        if(vis[i][j]==false){
            vis[i][j]=true;
            int val=1+dfs(i+1,j)+dfs(i,j+1)+dfs(i-1,j)+dfs(i,j-1)+dfs(i-1,j-1)+dfs(i+1,j+1)+dfs(i+1,j-1)+dfs(i-1,j+1);
            return val;
        }
        return 0;
    }
}
