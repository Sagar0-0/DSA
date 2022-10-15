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


//Approach 2


class Solution {
    class Pair {
        int i, j;
        Pair(int i, int j) {
            this.i=i;
            this.j=j;
        }
    }
    int shortestPath(int[][] grid, int[] source, int[] destination) {
        int visited[][]=new int[grid.length][grid[0].length];
        Queue<Pair> q=new LinkedList<>();
        visited[source[0]][source[1]]=1;
        if(grid[source[0]][source[1]] == 0) return -1;
        q.add(new Pair(source[0], source[1]));
        int ans=0;
        while(!q.isEmpty()) {
            int n=q.size();
            while(n>0) {
                Pair p=q.poll();
                if(p.i==destination[0] && p.j==destination[1]) return ans;
                
                Pair up=getPair(p.i, p.j+1, grid, visited);
                Pair down=getPair(p.i, p.j-1, grid, visited);
                Pair left=getPair(p.i-1, p.j, grid, visited);
                Pair right=getPair(p.i+1, p.j, grid, visited);
                
                if(up!=null) q.add(up);
                if(down!=null) q.add(down);
                if(left!=null) q.add(left);
                if(right!=null) q.add(right);
                n-=1;
            }
            ans+=1;
        }
        return -1;
    }
    public Pair getPair(int x, int y, int[][] grid, int [][]visited) {
        if(x<0 || y<0 || x>=grid.length || y>=grid[0].length) return null;
        if(grid[x][y]==0 || visited[x][y]==1) {
            return null;
        }
        visited[x][y]=1;        
        return new Pair(x, y);
    }
}
