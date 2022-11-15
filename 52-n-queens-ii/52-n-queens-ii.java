class Solution {
    int count;
    public int totalNQueens(int n) {
        boolean[][]board=new boolean[n][n];
        dfs(board,0);
        return count;    
    }
    public void dfs(boolean[][]board,int row){
        if(row==board.length){
            count++;
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                dfs(board,row+1);
                board[row][col]=false;
            }
        }
    }
    boolean isSafe(boolean[][] board,int row,int col){
        //checking vertically
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        
        //checking upper left
        int leftMin=Math.min(row,col);
        for(int i=1;i<=leftMin;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        
        //checking upper right
        int rightMin=Math.min(row,board.length-1-col);
        for(int i=1;i<=rightMin;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        //else true
        return true;
    }
}