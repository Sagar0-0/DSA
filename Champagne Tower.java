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

//======================================================================================================

class Solution {
    public double champagneTower(int poured, int queryRow, int queryGlass) {
	    if (poured == 0)
		    return 0;
	    var prevRow = new ArrayList<>(List.of((double) poured));

	    while (queryRow-- > 0) {
		    var currentRow = new ArrayList<Double>();
		    var champagneInEnds = Math.max(0, (prevRow.get(0) - 1) / 2);  // min champagne can be 0
		    currentRow.add(champagneInEnds); // first glass

		    for (var i = 1; i < prevRow.size(); i++)
			    currentRow.add(Math.max(0, (prevRow.get(i - 1) - 1) / 2) + // flow from top-left glass
						   Math.max(0, (prevRow.get(i) - 1) / 2));     // flow from top-right glass

		    currentRow.add(champagneInEnds); // last glass
		    prevRow = currentRow;
	    }
	    return Math.min(1, prevRow.get(queryGlass)); // max champagne can be 1
    }
} 
