class Solution{
    public int[][] computeBeforeMatrix(int N, int M,int[][] after ){
        // Code here
        int[][]before=new int[N][M];
        for(int row=0;row<N;row++){
            for(int col=0;col<M;col++){
                if(row==0 && col==0){
                    before[row][col]=after[row][col];
                }else if(row==0 && col>0){
                    before[row][col]=after[row][col]-after[row][col-1];
                }else if(col==0 && row>0){
                    before[row][col]=after[row][col]-after[row-1][col];
                }else{
                    before[row][col]=after[row][col]-(after[row-1][col]-after[row-1][col-1]+after[row][col-1] );
                }
            }
        }
        return before;
    }
}
