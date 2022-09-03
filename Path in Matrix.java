public class Solution {
    public int checkPath(int[][] A) {
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                if(A[i][j]==1){
                    return dfs(i,j,A)?1:0;
                }
            }
        }
        return 0;
    }
    boolean dfs(int i,int j,int[][]A){
        if(i<0 || j<0 || i==A.length || j==A.length || A[i][j]==0)return false;
        if(A[i][j]==2)return true;
        A[i][j]=0;
        return dfs(i+1,j,A) || dfs(i,j+1,A) || dfs(i-1,j,A) || dfs(i,j-1,A);
    }
}
