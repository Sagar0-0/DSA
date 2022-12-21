class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int[] colour = new int[n+1];
        ArrayList<Integer>[] dislikeMap = new ArrayList[n+1];
        
        for(int i = 1; i <= n; i++)
            dislikeMap[i] = new ArrayList<Integer>();
        
        for(int[] d: dislikes) {
            dislikeMap[d[0]].add(d[1]);
            dislikeMap[d[1]].add(d[0]);
        }
        
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            if(colour[i] == 0) {
                colour[i] = 1;
                queue = new LinkedList<>();
                queue.offer(i);
                
                while(!queue.isEmpty()) {
                    int curr = queue.poll();
                    
                    for(int neighbour: dislikeMap[curr]) {
                        if(colour[neighbour] == 0) {
                            colour[neighbour] = colour[curr] == 1?-1:1;
                            queue.offer(neighbour);
                        }
                        else {
                            if(colour[neighbour] == colour[curr])
                                return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}