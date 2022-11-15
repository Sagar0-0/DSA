class Solution {
   public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1||grid[n-1][n-1]==1)return -1;
        if(n==1&&grid[0][0]==0)return 1;
        grid[0][0]=1;
        List<int[]> pos=new ArrayList<>();
        pos.add(new int[]{0,0});
        check(grid,pos);
        if(grid[n-1][n-1]==0)return -1;
        return grid[n-1][n-1];
        
    }
    public void check(int[][] grid,List<int[]> pos){
        int n=grid.length;
        List<int[]> newpos=new ArrayList<>();
        for(int[] p:pos){
            int i=p[0];
            int j=p[1];
            int curdis=grid[i][j]+1;
            if(i>0&&j>0&&grid[i-1][j-1]==0){
                grid[i-1][j-1]=curdis;
                newpos.add(new int[]{i-1,j-1});
            }
            if(i<n-1&&j>0&&grid[i+1][j-1]==0){
                grid[i+1][j-1]=curdis;
                newpos.add(new int[]{i+1,j-1});
            }
            if(i>0&&j<n-1&&grid[i-1][j+1]==0){
                grid[i-1][j+1]=curdis;
                newpos.add(new int[]{i-1,j+1});
            }
            if(i<n-1&&j<n-1&&grid[i+1][j+1]==0){
                grid[i+1][j+1]=curdis;
                newpos.add(new int[]{i+1,j+1});
            }
            if(j>0&&grid[i][j-1]==0){
                grid[i][j-1]=curdis;
                newpos.add(new int[]{i,j-1});
            }
            if(j<n-1&&grid[i][j+1]==0){
                grid[i][j+1]=curdis;
                newpos.add(new int[]{i,j+1});
            }
            if(i<n-1&&grid[i+1][j]==0){
                grid[i+1][j]=curdis;
                newpos.add(new int[]{i+1,j});
            }
            if(i>0&&grid[i-1][j]==0){
                grid[i-1][j]=curdis;
                newpos.add(new int[]{i-1,j});
            }
        }
        if(!newpos.isEmpty())check(grid,newpos);
        
        
    }
}