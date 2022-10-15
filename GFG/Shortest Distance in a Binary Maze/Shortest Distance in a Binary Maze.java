class Solution {

    class Pair{
        int x;
        int y;
        Pair(int i,int j){
            x=i;
            y=j;
        }
    }
    int shortestPath(int[][] grid, int[] src, int[] des) {
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(src[0],src[1]));
        grid[src[0]][src[1]]=0;
        int dis=0;
        while(!q.isEmpty()){
            int sz=q.size();
            while(sz-->0){
                Pair curr=q.remove();
                int i=curr.x;
                int j=curr.y;
                if(i==des[0] && j==des[1])return dis;
                if(i>0 && grid[i-1][j]==1){
                    grid[i-1][j]=0;
                    q.add(new Pair(i-1,j));
                }
                if(j>0 && grid[i][j-1]==1){
                    grid[i][j-1]=0;
                    q.add(new Pair(i,j-1));
                }
                if(i<grid.length-1 && grid[i+1][j]==1){
                    grid[i+1][j]=0;
                    q.add(new Pair(i+1,j));
                }
                if(j<grid[0].length-1 && grid[i][j+1]==1){
                    grid[i][j+1]=0;
                    q.add(new Pair(i,j+1));
                }
            }
            dis++;
        }
        return -1;
    }
}
