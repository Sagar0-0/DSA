class UnionFind{
    int[]parent;
    int size;
    UnionFind(int row,int col){
        size=row*col;
        parent=new int[size];
        for(int i=0;i<size;i++){
            parent[i]=i;
        }
    }
    void union(int x,int y){
        int px=findParent(x);
        int py=findParent(y);
        parent[py]=px;
    }
    int findParent(int x){
        if(parent[x]==x)return x;
        return parent[x]=findParent(parent[x]);
    }
    int count(int [][]mat){
        int col=mat[0].length;
        int cnt=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    if(parent[i*col+j]==i*col+j){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}

class Solution {
    
    public List<Integer> numOfIslands(int rows, int cols, int[][] operators) {
        //Your code here
        int[][] mat=new int[rows][cols];
        List<Integer> ans=new ArrayList<>();
        UnionFind uf=new UnionFind(rows,cols);
        int[] dx=new int[]{1,0,-1,0};
        int[] dy=new int[]{0,1,0,-1};
        
        for(int[]operator:operators){
            int x=operator[0];
            int y=operator[1];
            mat[x][y]=1;
            for(int i=0;i<4;i++){
                int nx=x+dx[i];
                int ny=y+dy[i];
                if(nx>=0 && ny>=0 && nx<rows && ny<cols && mat[nx][ny]==1){
                    uf.union(x*cols+y,nx*cols+ny);
                }
            }
            ans.add(uf.count(mat));
        }
        return ans;
    }
    
}
