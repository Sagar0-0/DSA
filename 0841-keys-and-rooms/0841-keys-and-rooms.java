class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        int count = 0;
        count = dfs(rooms,0, visited, count);
        return count == rooms.size();
    }

    public int dfs(List<List<Integer>> rooms, int currRoom, boolean[] visited, int count) {
        if (visited[currRoom] == true) {
            return count;
        }
        visited[currRoom] = true;
        ++count;
        for (Integer roomKey: rooms.get(currRoom)) {
            count = dfs(rooms, roomKey, visited, count);
        }
        return count;
    }
}