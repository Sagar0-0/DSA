public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int isValidSudoku(final String[] A) {
        char[][] board=new char[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                board[i][j]=A[i].charAt(j);
            }
        }
          for(int i=0;i<9;i++){
            Set<Character> row=new HashSet<>();
            Set<Character> col=new HashSet<>();
            Set<Character> cube=new HashSet<>();
            int rowindex=(i/3)*3,colindex=(i%3)*3;
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'&&!(row.add(board[i][j])))
                    return 0;
                 if(board[j][i]!='.'&&!(col.add(board[j][i])))
                    return 0;
                if(board[rowindex+j/3][colindex+j%3]!='.'&&!(cube.add(board[rowindex+j/3][colindex+j%3])))
                    return 0;
            }
            
        }
        return 1;
    }
}

