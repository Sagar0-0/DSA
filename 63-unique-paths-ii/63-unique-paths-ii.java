class Solution {
    public int uniquePathsWithObstacles(int[][] a) {
        int result = 0;
        int m = a.length;
        int n = a[0].length;
        int[] row = new int[n];
        int prevCol;
        row[0] = 1 - a[0][0];
        for (int i = 1; i < n; ++i) {
            if (a[0][i] == 1 || a[0][i-1] == 1) {
                row[i] = 0;
                continue;
            }
            row[i] = row[i-1];
        }
        
        for (int i = 1; i < m; ++i) {
            if (a[i-1][0] == 1 || a[i][0] == 1) {
                row[0] = 0;
            }
            for (int j = 1; j < n; ++j) {
                if (a[i][j] == 1) {
                    row[j] = 0;
                    continue;
                }
                int tmp = 0;
                if (a[i-1][j] != 1) {
                    tmp += row[j];
                }
                if (a[i][j-1] != 1) {
                    tmp += row[j-1];
                }
                row[j] = tmp;
            }
        }
        return row[n-1];
    }
}