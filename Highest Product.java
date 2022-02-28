public class Solution {
    public int maxp3(int[] A) {
        int n=A.length;
        Arrays.sort(A);
        int ans=Math.max(A[0]*A[1]*A[n-1],A[n-3]*A[n-1]*A[n-2]);
        return ans;
    }
}
