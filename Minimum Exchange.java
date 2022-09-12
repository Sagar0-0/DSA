class Solution
{
    public int MinimumExchange(char[][] matrix) {
        int a = 0, b = 0;
        int m = matrix.length, n = matrix[0].length;
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j){
                if(matrix[i][j] == 'A'){
                    a++;
                } else {
                    b++;
                }
            }
        }
        if(a > b){
            return Count('A', 'B', matrix);
        } else if(a < b){
            return Count('B', 'A', matrix) ;
        } else {
            return Math.min(Count('A', 'B', matrix), Count('B', 'A', matrix));
        }
    }

    private int Count(char x, char y, char[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int cnt = 0;
        for(int i = 0; i < m; ++i){
            char ch = x;
            if(i % 2 == 1){
                ch = y;
            }
            for(int j = 0; j < n; ++j){
                if(matrix[i][j] != ch){
                    cnt++;
                }
                if(ch == x){
                    ch = y;
                } else {
                    ch = x;
                }
            }
        }
        return cnt / 2;
    }
}
