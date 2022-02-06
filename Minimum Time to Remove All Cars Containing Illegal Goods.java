class Solution {
    public int minimumTime(String s) {
        int n = s.length();
        int min = s.length();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = s.charAt(i) - '0';

		// step1
        int[] leftOptimized = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            leftOptimized[i] = Math.min(i, leftOptimized[i - 1] + (nums[i - 1] == 1? 2: 0));
        }

		// step2
        int[] rightOptimized = new int[n + 2];
        for (int i = n; i > 0; i--) {
            rightOptimized[i] = Math.min(n - i + 1, rightOptimized[i + 1] + (nums[i - 1] == 1? 2: 0));
        }

		// step3
        for (int p = 0; p <= n; p++) {
            min = Math.min(min, leftOptimized[p] + rightOptimized[p + 1]);
        }

        return min;
    }
}
