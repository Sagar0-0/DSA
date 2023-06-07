class Solution {
    int[][] dirs = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    
    public boolean exist(char[][] board, String word) {
        int[] alphFreqForBoard = new int[26]; 
        int[] alphFreqForWord = new int[26]; 
        
        for (char cc : word.toCharArray()) {
            alphFreqForWord[cc - 'A']++; 
        }
        
        for (char[] row : board) {
            for (char c : row) {
                alphFreqForBoard[c - 'A']++; 
            }
        }
        
        for (char cc : word.toCharArray()) {
            if (alphFreqForBoard[cc - 'A'] < alphFreqForWord[cc - 'A']) {
                return false; 
            }
        }
        
        if (alphFreqForBoard[word.charAt(0) - 'A'] > alphFreqForWord[word.charAt(word.length() - 1) - 'A']) {
            word = new StringBuilder(word).reverse().toString();
        }
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean dfs(char[][] board, String word, int i, int j, int ci) {
        if(ci == word.length()) {
            return true;
        }
        
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return false;
        }
        
        char c = board[i][j];
        
        if(c != word.charAt(ci) || c == '#') {
            return false;
        }
        
        board[i][j] = '#';
        
        for(int[] dir : dirs) {
            if(dfs(board, word, i + dir[0], j + dir[1], ci + 1)) {
                board[i][j] = c; // Restore the original character
                return true;
            }
        }
        
        board[i][j] = c; // Restore the original character
        
        return false;
    }
}
