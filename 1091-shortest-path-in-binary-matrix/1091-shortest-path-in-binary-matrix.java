class Solution {
    class Pair{
        int x;
        int y;
        Pair(int a,int b){
            x=a;
            y=b;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<Pair> q=new LinkedList<>();
        int n=grid.length;
        int ans=1;
        boolean[][]vis=new boolean[n][n];
        if(valid(grid,0,0,vis))
            q.add(new Pair(0,0));
        vis[0][0]=true;
        while(q.size()>0 && !vis[n-1][n-1]){
            ans++;
            int sz=q.size();
            for(int a=0;a<sz;a++){
                Pair pair=q.remove();
                int i=pair.x;
                int j=pair.y;
                if(valid(grid,i+1,j+1,vis)){
                    q.add(new Pair(i+1,j+1));
                    vis[i+1][j+1]=true;
                }
                if(valid(grid,i-1,j-1,vis)){
                    q.add(new Pair(i-1,j-1));
                    vis[i-1][j-1]=true;
                }
                if(valid(grid,i+1,j,vis)){
                    q.add(new Pair(i+1,j));
                    vis[i+1][j]=true;
                }
                if(valid(grid,i-1,j,vis)){
                    q.add(new Pair(i-1,j));
                    vis[i-1][j]=true;
                }
                if(valid(grid,i+1,j-1,vis)){
                    q.add(new Pair(i+1,j-1));
                    vis[i+1][j-1]=true;
                }
                if(valid(grid,i,j+1,vis)){
                    q.add(new Pair(i,j+1));
                    vis[i][j+1]=true;
                }
                if(valid(grid,i,j-1,vis)){
                    q.add(new Pair(i,j-1));
                    vis[i][j-1]=true;
                }
                if(valid(grid,i-1,j+1,vis)){
                    q.add(new Pair(i-1,j+1));
                    vis[i-1][j+1]=true;
                }
            }
        }
        if(vis[n-1][n-1]==false)return -1;
        return ans;
    }
    public boolean valid(int[][]grid,int i,int j,boolean[][]vis){
        int n=grid.length;
        if(i<0 || j<0 || i==n || j==n)return false;
        if(vis[i][j] || grid[i][j]==1)return false;
        return true;
    }
}