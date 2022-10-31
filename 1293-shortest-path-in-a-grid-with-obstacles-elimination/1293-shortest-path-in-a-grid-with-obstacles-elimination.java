class Solution {
    class Node {
        int row;
        int col;
        int obstacles;

        Node(int row, int col, int obstacles){
            this.row = row;
            this.col = col;
            this.obstacles = obstacles;
        }
    }
    
    private int[][] directions = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
    
    public int shortestPath(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] visited = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            Arrays.fill(visited[i], Integer.MAX_VALUE);
        }
        
        visited[0][0] = grid[0][0];
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0, grid[0][0]));
        int result = 0;
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                Node node = queue.poll();
                if(node.row == rows-1 && node.col == cols-1) {
                    return result;
                }
                for(int t = 0; t < directions.length; t++) {
                    int newRow = node.row + directions[t][0];
                    int newCol = node.col + directions[t][1];
                    
                    if(newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {

                        int obstacles = node.obstacles + grid[newRow][newCol];
                        if(obstacles > k) {
                            continue;
                        }
                        if(visited[newRow][newCol] > obstacles) {
                            visited[newRow][newCol] = obstacles;
                            queue.add(new Node(newRow, newCol, obstacles));
                        }
                    }
                }
            }
            result++;
        }
        return -1;
    }
}