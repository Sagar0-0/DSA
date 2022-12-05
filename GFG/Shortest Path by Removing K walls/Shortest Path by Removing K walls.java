class Solution {
    static int shotestPath(int[][] mat, int n, int m, int k) {
        // code here
        int[][]dirs={{1,0},{0,1},{0,-1},{-1,0}};
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{0,0,k});
        boolean[][][]vis=new boolean[n][m][k+1];
        vis[0][0][k]=true;
        int dis=0;
        while(!q.isEmpty()){
            int sz=q.size();
            while(sz-->0){
                int[]curr=q.remove();
                if(curr[0]==n-1 && curr[1]==m-1)return dis;
                for(int[]d:dirs){
                    int i=curr[0]+d[0];
                    int j=curr[1]+d[1];
                    int obs=curr[2];
                    if(i<n && j<m && i>=0 && j>=0){
                        if(mat[i][j]==0 && !vis[i][j][obs]){
                            q.add(new int[]{i,j,obs});
                            vis[i][j][obs]=true;
                        }else if(mat[i][j]==1 && obs>0 && !vis[i][j][obs-1]){
                            q.add(new int[]{i,j,obs-1});
                            vis[i][j][obs-1]=true;
                        }
                    }
                }
            }
            dis++;
        }
        return -1;
    }
};
