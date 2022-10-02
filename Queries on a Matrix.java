class Solution {
    public int[][] solveQueries(int n, int[][] Queries) {
        // Code here
        int[][] mat = new int[n][n];
        for(int[] q : Queries) {
            int a=q[0];
            int b=q[1];
            int c=q[2];
            int d=q[3];
            for(int row=a;row<=c;row++){
                mat[row][b]++;
                if(d+1<n)mat[row][d+1]--;
            }
        }
        for(int col=1;col<n;col++){
            for(int row=0;row<n;row++){
                mat[row][col]+=mat[row][col-1];
            }
        }
        
        return mat;
    }
}
