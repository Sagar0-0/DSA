class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                board[i][j]='.';
        int leftRow[]=new int[n];
        int upperDiagonal[]=new int[2*n-1];
        int lowerDiagonal[]=new int[2*n -1];
        List<List<String>> res=new ArrayList<>();
        solve(res, 0,board, leftRow, upperDiagonal, lowerDiagonal);
        return res;
    }
    public static void solve(List<List<String>> res, int col, char[][] board, int[] leftRow, int[] upperDiagonal, int[] lowerDiagonal)
    {
        int n=board.length;
        if(col==n){
            res.add(construct(board));
            return;
        }
        for(int row=0;row<board.length;row++)
            if(leftRow[row]==0 && upperDiagonal[n-1+col-row]==0 && lowerDiagonal[row+col]==0){
                board[row][col]='Q';
                leftRow[row]=1;
                upperDiagonal[n-1+col-row]=1;
                lowerDiagonal[row+col]=1;
                solve(res, col+1,board, leftRow, upperDiagonal, lowerDiagonal);
                board[row][col]='.';
                leftRow[row]=0;
                upperDiagonal[n-1+col-row]=0;
                lowerDiagonal[row+col]=0;
            }
        
    }
    
    public static List<String> construct(char[][] board){
        List<String> fans=new ArrayList<>();
        for(int i=0;i<board.length;i++)
        {
            String s=new String(board[i]);
            // fans.add(new String(board[i]));
            fans.add(s);
        }
        return fans;
    }
}