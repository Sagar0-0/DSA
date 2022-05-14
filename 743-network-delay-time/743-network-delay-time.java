class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        final int INF = Integer.MAX_VALUE/2;
        
        int[][] graph = new int[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(graph[i], INF);
        }
        for(int t[] : times){
            int x = t[0] - 1, y = t[1] - 1;
            graph[x][y] = t[2];
        }
        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        boolean[] visted = new boolean[n];
        dist[k-1] = 0;
        
        for(int i = 0; i < n; i++){
            int x = -1;
            for(int y = 0; y < n; y++){
                if(!visted[y] && (x == -1 || dist[y] < dist[x]))
                    x = y;
            }
            visted[x] = true;
            for(int y = 0; y < n; y++){
                dist[y] = Math.min(dist[y], dist[x]+graph[x][y]);
            }
        }
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dist[i]);
        }
        
        return ans == INF ? -1 : ans;

    }
}