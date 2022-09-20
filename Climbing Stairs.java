public class Solution {
    public int solve(ArrayList<Integer> A) {
     
        int n = A.size();
        int steps = A.get(0);
        int dp[] = new int[n];
        dp[0] = steps;
        dp[1] = steps + A.get(1);
        for(int i = 2; i < n; i++){
            dp[i] = Math.min(dp[i-1], dp[i-2]) + A.get(i);
        }
       
        return dp[n-1];
    }
}
