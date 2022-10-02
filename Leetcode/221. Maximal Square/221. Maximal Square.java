class Solution {
    public int maximalSquare(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxSquare = 0;
        int[][] maxSideLength = new int[rows+1][cols+1];

        for(int i=rows-1;i>=0;i--){
            for(int j=cols-1;j>=0;j--){
                if(matrix[i][j] == '1'){
                    // maximum sideLength of square is minimum of length covered by either of row, column, diagonal
                    maxSideLength[i][j] = Math.min(maxSideLength[i+1][j],Math.min(maxSideLength[i][j+1],maxSideLength[i+1][j+1]))+1;
                    maxSquare = Math.max(maxSquare, maxSideLength[i][j]);
                }else{
                    maxSideLength[i][j] = 0;
                }
            }
        }
        return maxSquare*maxSquare;
    }
}
   