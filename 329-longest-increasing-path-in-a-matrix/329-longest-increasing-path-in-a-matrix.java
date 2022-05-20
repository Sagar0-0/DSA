class Solution {
    int[][] matrix, helper;
    int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int longestIncreasingPath(int[][] matrix) {
        helper = new int[matrix.length][matrix[0].length];
        this.matrix= matrix;
        int path = 0;
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) 
                path = Math.max(path, dfs(i, j));
        }
        
        return path;
    }
     
    private int dfs(int x, int y) {
        if (helper[x][y] != 0) return helper[x][y];
        for(int d=0;d<dirs.length;d++) {
            int i = dirs[d][0] + x, j = dirs[d][1] + y;
            if(i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length && matrix[x][y] < matrix[i][j]) {
                helper[x][y] = Math.max(helper[x][y], dfs(i, j));
            }
        }
        return ++helper[x][y];
    }
}