class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int n = stations.length;
        int maxPos = startFuel, ans = 0;
        while (maxPos < target) {
            int curMax = 0;
            int curPos = -1;
            for (int i = 0; i < n; i++) {
                if (maxPos >= stations[i][0] && stations[i][1] > curMax) {
                    curMax = stations[i][1];
                    curPos = i;
                }
            }
            if (curMax == 0) {
                break;
            }
            ans++;
            maxPos += curMax;
            stations[curPos][0] = Integer.MAX_VALUE;
        }
        return maxPos >= target ? ans : -1;
    }
}