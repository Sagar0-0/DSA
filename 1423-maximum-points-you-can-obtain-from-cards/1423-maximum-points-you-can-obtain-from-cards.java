class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length, l= 0, r = n - k ;
        
        int total = 0;
        for (int i = r; i<n; i++) {
            total += cardPoints[i];
        }
        int res = total;
        while (r < n) {
            total += (cardPoints[l] - cardPoints[r]);
            res = Math.max(res, total);
            l++;
            r++;
        }
        return res;
    }
}