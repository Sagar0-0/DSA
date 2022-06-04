class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board=new boolean[n][n];
        List<List<String>> list=new ArrayList<>();
        nQueen(board,0,list);
        return list;
    }
    void nQueen(boolean[][] board,int row,List<List<String>> ans){
        if(row==board.length){
            saveRes(board,ans);
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                nQueen(board,row+1,ans);
                board[row][col]=false;
            }
        }
    }
    
    void saveRes(boolean[][] board,List<List<String>> ans){
        List<String> l=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String s="";
            for(int j=0;j<board.length;j++){
                if(board[i][j]){
                    s+="Q";
                }else{
                    s+=".";
                }
            }
            l.add(s);
        }
        ans.add(l);
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