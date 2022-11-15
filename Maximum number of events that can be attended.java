class Solution {
    static int maxEvents(int[] start, int[] end, int N) {
        // code here
        int[][] arr = new int[N][2];
        
        for(int i=0; i<N; i++){
            arr[i][0] = start[i];
            arr[i][1] = end[i];
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int i = 0, res = 0, d = 0;
        while (!pq.isEmpty() || i < N) {
            if (pq.isEmpty())
                d = arr[i][0];
            while (i < N && arr[i][0] <= d)
                pq.offer(arr[i++][1]);
            pq.poll();
            ++res; ++d;
            while (!pq.isEmpty() && pq.peek() < d)
                pq.poll();
        }
        return res;
    }
};
