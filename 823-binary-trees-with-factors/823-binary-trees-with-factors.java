class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length, mod = 1_000_000_007;
        long[] dp = new long[n];
        long res = 0;
        Map<Integer, Integer> idxs = new HashMap();
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0) { // A[j] is left child
                    int right = arr[i] / arr[j];
                    if (idxs.containsKey(right)) {
                        dp[i] = (dp[i] + dp[j] * dp[idxs.get(right)]) % mod;
                    }
                }
            }
            idxs.put(arr[i], i);
            res += dp[i];
            res %= mod;
        }
        return (int) res;
    }
}