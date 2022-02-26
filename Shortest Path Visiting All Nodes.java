class Solution {
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        if(n==1) return 0;
        int target = (1 << n) - 1;
        boolean[][] seen = new boolean[n][target];
        Queue<int[]> q = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            int source = 1 << i;
            q.add(new int[] {i,source});
            seen[i][source] = true;
        }
        
        int level = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] currentPair = q.remove();
                int node = currentPair[0];
                int mask = currentPair[1];
                for (int nei : graph[node]) {
                    int nextMask = mask | (1 << nei);
                    if (nextMask == target) return level + 1;
                    
                    if (!seen[nei][nextMask]) {
                        seen[nei][nextMask] = true;
                        q.add(new int[] {nei, nextMask});
                    }
                }
            }
            level++;
        }
        
        return -1;
    }
}
