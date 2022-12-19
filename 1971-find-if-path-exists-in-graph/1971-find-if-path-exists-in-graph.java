class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) {
        boolean[] visited = new boolean[n];
        visited[start] = true;
        
        boolean newVisited = true;
         
        while(!visited[end] && newVisited) {
            newVisited = false;
            for (int i = edges.length - 1; i > -1; i--) {
                if (visited[edges[i][0]]) {
                    if (!visited[edges[i][1]]) {
                        newVisited = visited[edges[i][1]] = true;
                    }
                } else if (visited[edges[i][1]]){
                    newVisited = visited[edges[i][0]] = true;
                }
            }
        }
        
        return visited[end];
    }
}