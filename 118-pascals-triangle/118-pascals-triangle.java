class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        triangle.add(new ArrayList<Integer>());
        triangle.get(0).add(1);
        
        for(int i=1; i<numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> previousRow = triangle.get(i-1);
            
            //first element is always 1
            row.add(1);
            
            for(int j=1; j<i; j++) {
                //Add two cells directly above the current row
                row.add(previousRow.get(j-1) + previousRow.get(j));
            }
            
            //last element of a row is also 1
            row.add(1);
            
            triangle.add(row);
        }
        return triangle;
    }
}