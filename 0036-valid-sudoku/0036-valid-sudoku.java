class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if((checkRow(board,i,j) &&
                    checkCol(board,i,j) &&
                    checkBox(board,i,j))==false)return false;
                }
            }
        }
        return true;
    }
    boolean checkRow(char[][]board,int row,int col) {
        for(int i=0;i<9;i++){
            if(board[row][i]==board[row][col] && col!=i){
                return false;
            }
        }
        return true;
    }
    boolean checkCol(char[][]board,int row,int col) {
        for(int i=0;i<9;i++){
            if(board[i][col]==board[row][col] && row!=i){
                return false;
            }
        }
        return true;
    }
    boolean checkBox(char[][]board,int row,int col) {
        int boxx=row/3;
        int boxy=col/3;
        int startx=3*boxx;
        int starty=3*boxy;
        for(int i=startx;i<startx+3;i++){
            for(int j=starty;j<starty+3;j++){
                if(board[i][j]==board[row][col] && (i!=row && j!=col))return false;
            }
        }
        return true;
    }
}