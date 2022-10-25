class Solution {
    public void solveSudoku(char[][] board) {
        dfs(0,0,board);
    }
    boolean dfs(int i,int j,char[][]board){
        if(i==9)return true;
        if(board[i][j]!='.'){
            if(j==8){
                return dfs(i+1,0,board);
            }else{
                return dfs(i,j+1,board);
            }
        }
        
        for(int num=1;num<=9;num++){
            board[i][j]=(char)(num+'0');
            if(safe(board,i,j)){
                boolean ans;
                if(j==8){
                    ans=dfs(i+1,0,board);
                }else{
                    ans=dfs(i,j+1,board);
                }
                if(ans)return true;
            }
            board[i][j]='.';
        }
        
        return false;
    }
    boolean notInRow(char arr[][], int row)
    {
        HashSet<Character> st = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (st.contains(arr[row][i]))
                return false;
 
            if (arr[row][i] != '.')
                st.add(arr[row][i]);
        }
        return true;
    }
    boolean notInCol(char arr[][], int col)
    {
        HashSet<Character> st = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (st.contains(arr[i][col]))
                return false;
            if (arr[i][col] != '.')
                st.add(arr[i][col]);
        }
        return true;
    }
    boolean notInBox(char arr[][], int startRow, int startCol)
    {
        HashSet<Character> st = new HashSet<>();
 
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                char curr = arr[row + startRow][col + startCol];
                if (st.contains(curr))
                    return false;
                
                if (curr != '.')
                    st.add(curr);
            }
        }
        return true;
    }
    boolean safe(char arr[][], int row,
                                  int col)
    {
        return notInRow(arr, row) && notInCol(arr, col)
            && notInBox(arr, row - row % 3, col - col % 3);
    }
}