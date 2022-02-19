class axis{
    int x;
    int y;
    public axis(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if (!(o instanceof axis))
            return false;
        axis a = (axis) o;
        return x==a.x && y==a.y;
    }
}
class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    axis a=new axis(i,j);
                    clearIsland(grid,a);
                }
            }
        }
        return count;
    }
    public void clearIsland(char[][]grid,axis ax){
        Deque<axis> stack=new ArrayDeque<>();
        stack.push(ax);
        while(!stack.isEmpty()){
            axis a=stack.pop();
            int i=a.x;
            int j=a.y;
            grid[i][j]='0';
            if((i-1)>=0){
                if(grid[i-1][j]=='1'){
                    stack.push(new axis(i-1,j));
                }
            }
            if((i-1)>=0 && j+1<grid[0].length){
                if(grid[i-1][j+1]=='1'){
                    stack.push(new axis(i-1,j+1));
                }
            }
            if(j+1<grid[0].length){
                if(grid[i][j+1]=='1'){
                    stack.push(new axis(i,j+1));
                }
            }
            if(i+1<grid.length && j+1<grid[0].length){
                if(grid[i+1][j+1]=='1'){
                    stack.push(new axis(i+1,j+1));
                }
            }
            if(i+1<grid.length){
                if(grid[i+1][j]=='1'){
                    stack.push(new axis(i+1,j));
                }
            }
            if(i+1<grid.length && j-1>=0){
                if(grid[i+1][j-1]=='1'){
                    stack.push(new axis(i+1,j-1));
                }
            }
            if(j-1>=0){
                if(grid[i][j-1]=='1'){
                    stack.push(new axis(i,j-1));
                }
            }
            if(j-1>=0 && i-1>=0){
                if(grid[i-1][j-1]=='1'){
                    stack.push(new axis(i-1,j-1));
                }
            }
        }
    }
}
