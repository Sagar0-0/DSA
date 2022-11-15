class NumMatrix {
    int[][]mat;
    int[][]sum;
    public NumMatrix(int[][] matrix) {
        mat=matrix;
        int n=matrix.length;
        int m=matrix[0].length;
        sum=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==0){
                    sum[i][j]=mat[i][j];
                }else{
                    sum[i][j]=mat[i][j]+sum[i][j-1];
                }
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans=0;
        if(col1==0){
            while(row1<=row2){
                ans+=sum[row1][col2];
                row1++;
            }
        }else{
            while(row1<=row2){
                ans+=sum[row1][col2]-sum[row1][col1-1];
                row1++;
            }
        }
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */