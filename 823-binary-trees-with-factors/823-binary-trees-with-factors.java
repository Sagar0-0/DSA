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
                if (arr[j]*arr[j] > arr[i]) break;
                if (arr[i] % arr[j] == 0 && idxs.containsKey(arr[i]/arr[j])) {
                    if (arr[j]*arr[j] == arr[i]) {
                        dp[i] += dp[j]*dp[j];
                        dp[i] %= mod;
                    }
                    else {
                        dp[i] += 2*dp[j]*dp[idxs.get(arr[i]/arr[j])];
                        dp[i] %= mod;
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