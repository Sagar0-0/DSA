class Solution {
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int low = 1, high = stalls[n - 1] - stalls[0];
        while (low <= high) {
            int mid = (low + high) >> 1;

            if (isPossible(stalls, n, k, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
    
    static boolean isPossible(int stalls[], int n, int k, int minDist) {
        int c = 1;
        int l = stalls[0];
        for (int i = 1; i < n; i++) {
            if (stalls[i] - l >= minDist) {
                c++;
                l = stalls[i];
            }
        }
        if (c >= k) return true;
        return false;
    }
}
