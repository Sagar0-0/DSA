class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        //swap rows
        for(int i=0;i<n/2;i++){
            int[] row=matrix[i];
            matrix[i]=matrix[n-1-i];
            matrix[n-1-i]=row;
        }
        
        //tranpose
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int ele=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=ele;
            }
        }
    }
}