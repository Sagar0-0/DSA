class Solution {
    public static boolean isCorrect(char[][] board,int x,int y){
        for(int i=0;i<board.length;i++){
            if(i!=y && board[x][i]==board[x][y]) return false;
            if(i!=x && board[i][y]==board[x][y]) return false;
        }
        int row=(x/3)*3; 
        int col=(y/3)*3;
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                if((i!=x && j!=y) && board[i][j]==board[x][y]) return false;
            }
        } 
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]!='.'){
                    if(!isCorrect(board,i,j)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
}