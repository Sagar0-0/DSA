class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> (matrix[a[0]][a[1]] - matrix[b[0]][b[1]]));

        int n=matrix.length;
        for (int i = 0; i < Math.min(n, k); i++) {
            queue.offer(new int[] { i, 0 });
        }
        while (k > 1) {
            int[] cur = queue.poll();
            if (cur[1] < n - 1) {
                cur[1]++;
                queue.offer(cur);
            }
            k--;
        }

        return matrix[queue.peek()[0]][queue.peek()[1]];
    }
}