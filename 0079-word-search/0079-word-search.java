class Solution {
    int[][] dirs = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    boolean die;
    
    public boolean exist(char[][] board, String word) {
        int[] alphFreqForBoard = new int['z' - 'A' + 1]; 
        int[] alphFreqForWord = new int['z' - 'A' + 1]; 
        for (char cc : word.toCharArray()) {
            alphFreqForWord[cc - 'A']++; 
        }
        
        // count the alphabet occurance frequence in the board 
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                alphFreqForBoard[board[r][c] - 'A']++; 
            }
        }
        
        for (char cc : word.toCharArray()) {
            if (alphFreqForBoard[cc - 'A'] < alphFreqForWord[cc - 'A']) {
                return false; 
            }
        }
        
        if (alphFreqForBoard[word.charAt(0) - 'A'] > alphFreqForWord[word.charAt(word.length() - 1) - 'A']) {
            char[] reverseWord = new char[word.length()]; 
            for (int xx = 0, yy = word.length() - 1; yy >= 0; xx++, yy--) {
                reverseWord[xx] = word.charAt(yy); 
            }
            word = new String(reverseWord); 
        }
        die = false;
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(dfs(board, word, i, j, 0)) return true;
            }
        }
        
        return false;
    }
    
    private boolean dfs(char[][] board, String word, int i, int j, int ci) {
        if(die) return true;
        else if(ci == word.length()) return die = true;
        else if(i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false;
        
        char c = board[i][j];
        if(c != word.charAt(ci)) return false;
        else if(c == '#') return false;
        
        boolean found = false;
        board[i][j] = '#';
        
        for(int[] dir : dirs) {
            found |= dfs(board, word, i+dir[0], j+dir[1], ci+1);
            if(found) break;
        }
        
        board[i][j] = c;
        
        return found;
    }
}