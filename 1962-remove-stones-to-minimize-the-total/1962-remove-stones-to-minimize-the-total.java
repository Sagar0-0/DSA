public class Solution {
    public int minStoneSum(int[] piles, int k) {
        int sum = 0;
        int a[] = new int[10001];
        for (int i : piles) {
            sum += i;
            a[i]++;
        }
        for (int i = 10000; i > 0 && k > 0; i--) {
            if (a[i] > 0) {
                int b = i / 2;
                sum -= Math.min(k, a[i]) * b;
                a[i - i / 2] += a[i];
                k -= a[i];
            }
        }
        return sum;

    }
}