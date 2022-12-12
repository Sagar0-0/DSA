class Solution {
    public int climbStairs(int n) {
        if (n < 3) return n;
        int oneStep = 1, twoStep = 2;
        for (int i = 3; i <= n; i++) {
            int count = oneStep + twoStep;
            oneStep = twoStep;
            twoStep = count;
        }
        return twoStep;
    }
}