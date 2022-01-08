class Solution {
    public int cherryPickup(int[][] grid) {
        int dir[] = new int[]{-1, 0, 1};

        int row = grid.length;
        int col = grid[0].length;
        int dp[][][] = new int[row][col][col]; 
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                for(int k = 0; k < col; k++){
                    dp[i][j][k] = -1;
                }
            }
        }
        int col1 = 0; 
        int col2 = col - 1; 
        
        dp[0][col1][col2] = grid[0][col1] + grid[0][col2]; 
        int max = dp[0][col1][col2]; 
        
        for(int i = 1; i < row; i++){ 
            for(int c1 = 0; c1 < col; c1++){ 
                for(int c2 = 0; c2 < col; c2++){
                    int prev = dp[i - 1][c1][c2]; 
                    if(prev >= 0){ 
                        for(int d1: dir){ 
                            col1 = d1 + c1;
                            for(int d2: dir){ 
                                col2 = d2 + c2;
                                if(inRange(col1, col) && inRange(col2, col)){
                                    dp[i][col1][col2] = Math.max(dp[i][col1][col2], prev+(col1 == col2 ? grid[i][col1] : (grid[i][col1] + grid[i][col2]))); 
                                    max = Math.max(max, dp[i][col1][col2]); 
                                }
                            }
                        }
                    }
                    
                }
            }
        }
        return max;
    }

    public boolean inRange(int val, int limit){
        return 0 <= val && val < limit;
    }
}
