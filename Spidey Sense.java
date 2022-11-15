class Solution{
    
    static int directions[][] = {{-1,0},{0,1},{1,0},{0,-1}};
    
    public static void add(char mat[][], int i, int j, boolean visited[][], Queue<int[]> q){
        int n = mat.length;
        int m = mat[0].length;
        if(i<0 || i>=n || j<0 || j>=m || visited[i][j] || mat[i][j]=='W') return;
        visited[i][j] = true;
        q.offer(new int[]{i,j});
    }
    
    public static int bfs(char mat[][], int i, int j){
        int n = mat.length;
        int m = mat[0].length;
        boolean visited[][] = new boolean[n][m];
        visited[i][j] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i,j});
        int min = 0;
        while(!q.isEmpty()){
            int len = q.size();
            min++;
            for(int k=0;k<len;k++){
                int curr[] = q.poll();
                if(mat[curr[0]][curr[1]]=='B') return min-1;
                for(int dir[]: directions) add(mat,curr[0]+dir[0],curr[1]+dir[1],visited,q);
            }
        }
        return -1;
    }
    
    public static int[][] findDistance(char mat[][], int n,int m){
        // Your code goes here
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]=='W') arr[i][j] = -1;
                else if(mat[i][j]=='B') arr[i][j] = 0;
                else arr[i][j] = bfs(mat,i,j);
            }
        }
        return arr;
    }
}
