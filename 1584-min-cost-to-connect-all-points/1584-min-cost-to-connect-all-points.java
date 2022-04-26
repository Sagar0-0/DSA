class Solution {
    protected int getManDist(int[] a, int[] b) {
        return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
    } 
    
    public int minCostConnectPoints(int[][] points) {
        if (points.length < 2) {
            return 0;
        }
        
        int n = points.length;
        boolean[] inMST = new boolean[n];
        int[] curMinDistToEachNode = new int[n];
        int cost = 0;
        int edges = 0;
        int cur = 0;
        
        while (edges < n - 1) {
            int minIndex = 0;
            int minCost = Integer.MAX_VALUE;
            inMST[cur] = true;
            
            for (int i = 0; i < n; ++i) {
                if (!inMST[i]) {
                    int dist = getManDist(points[cur], points[i]);
                    if (cur == 0 || curMinDistToEachNode[i] > dist) {
                        curMinDistToEachNode[i] = dist;
                    }
                    
                    if (curMinDistToEachNode[i] < minCost) {
                        minCost = curMinDistToEachNode[i];
                        minIndex = i;
                    }
                }               
            }
            
            cost += minCost;
            cur = minIndex;
            edges++;
        }
        
        
        return cost;
    }
}