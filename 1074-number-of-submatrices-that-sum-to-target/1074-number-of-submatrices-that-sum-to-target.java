class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int res = 0;
        
        // traverse upper boundary
        for (int top = 0; top < m; top++) {
            
            // for each upper boundary, we have a prefix sum array
            int[] sum = new int[n];
            
            // traverse lower boundary
            for (int bottom = top; bottom < m; bottom++) {
                
                // count the prefix sum for each column
                for (int col = 0; col < n; col++) {
                    sum[col] += matrix[bottom][col];
                }
          
                // traverse left and right boundary
                for (int left = 0; left < n; left++) {
                    int cnt = 0;
                    for (int right = left; right < n; right++) {
                        cnt += sum[right];
                        if (cnt == target) res++;
                    }
                }
            }
        }
        return res;
    }
}