class Solution {
    public int minimumEffortPath(int[][] heights) {
        int[][] dirs = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
        int numR = heights.length; int numC = heights[0].length;
        int[][] ans = new int[numR][numC];
        for (int[] row : ans) {
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->a[2]-b[2]);
        queue.offer(new int[]{0,0,0});
        ans[0][0] = 0;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            if (curr[0]==numR-1 && curr[1]==numC-1) return curr[2];
            for (int i=0; i<4; i++) {
                int nextR = curr[0]+dirs[i][0];
                int nextC = curr[1]+dirs[i][1];
                if (nextR<0 || nextC<0 || nextR>=numR || nextC>=numC) continue;
                int diff = Math.abs(heights[nextR][nextC]-heights[curr[0]][curr[1]]);
                int max = Math.max(diff,curr[2]);
                if (max<ans[nextR][nextC]) {
                    ans[nextR][nextC] = max;
                    queue.offer(new int[]{nextR,nextC,max});
                }
            }
        }
        return ans[numR-1][numC-1];
    }
}