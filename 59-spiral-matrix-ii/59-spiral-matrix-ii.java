class Solution {
    public int[][] generateMatrix(int n) {
        
        int ans[][] = new int[n][n];
        fillMatrix(ans, 0 , 0, 1,'r');
        return ans;
    }
    
    public void fillMatrix(int [][]ans, int i, int j, int cur, char dir){
        if(i < 0 || j < 0 || i >=ans.length ||  j >= ans.length) return;
        
        if(ans[i][j] != 0) return;
        
        ans[i][j] = cur;
        
        if(dir == 'u'){
            fillMatrix(ans, i-1,j,cur+1, 'u');    
        }
        
        fillMatrix(ans, i,j+1,cur+1, 'r');
        fillMatrix(ans, i+1,j,cur+1, 'd');
        fillMatrix(ans, i,j-1,cur+1, 'l');
        fillMatrix(ans, i-1,j,cur+1, 'u');
       
    }
}