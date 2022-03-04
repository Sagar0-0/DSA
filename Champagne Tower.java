class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        if (poured == 0) return 0;
        int rows = 100;
        double[][] champagneTower = new double[rows + 1][rows + 1];

        champagneTower[0][0] = poured;

        for (int row = 0; row <= query_row; row++) {
            for (int column = 0; column <= row; column++) {
                double splittingWine = (champagneTower[row][column] - 1.0) / 2.0;
                if (splittingWine > 0) {
                    champagneTower[row + 1][column] += splittingWine;
                    champagneTower[row + 1][column + 1] += splittingWine;
                }
            }
        }
        return Math.min(1, champagneTower[query_row][query_glass]);
    }
} 
