class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length-1;i++){
            int[]mat1=matrix[i];
            int[]mat2=matrix[i+1];
            for(int j=0;j<mat1.length-1;j++){
                if(mat1[j]!=mat2[j+1])return false;
            }
        }
        return true;
    }
}