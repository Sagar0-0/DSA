class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        
        Queue<int[]> q = new LinkedList<>();
        int ei = entrance[0];
        int ej = entrance[1];
        int[][] dvs = new int[][] {
            {1, 0}, {0, 1}, {-1, 0}, {0, -1}    
        };
        
        maze[ei][ej] = '+';
        q.add(new int[] {ei, ej, 0});
        
        while(!q.isEmpty()) {
            int[] val = q.poll();
            
            for (int[] d: dvs) {
                int i1 = val[0] + d[0];
                int j1 = val[1] + d[1];
                
                if (i1 < 0 || j1 < 0 || i1 >= m || j1 >= n) {
                    if (val[0] == ei && val[1] == ej) continue;
                    return val[2];
                }
                
                if (maze[i1][j1] == '.') {
                    q.add(new int[] {i1, j1, val[2] + 1});
                    maze[i1][j1] = '+';
                }
            }
        }
        
        return -1;
    }
}