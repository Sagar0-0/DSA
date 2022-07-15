class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int max=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0 ;j<grid[0].length; j++){
                if(grid[i][j]==1){
                    int area=iarea(grid,i,j);
                    if(area >max)
                        max=area;
                }
            }
        }
        return max;
    }
    public static int iarea(int [][]grid,int i,int j){
        if(i<grid.length && j<grid[0].length && i>=0 &&  j>=0 && grid[i][j]==1){
            grid[i] [j]   =0;
            int up=iarea(grid,i-1,j);
            int down=iarea(grid, i+1,j);
            int left=iarea(grid, i,j-1);
            int right=iarea(grid,i,j+1);
            return 1+left+right+up+down;
        }
     return 0;       
    }
}