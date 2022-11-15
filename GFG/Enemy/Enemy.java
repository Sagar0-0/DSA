class Solution {
    public static int largestArea(int n,int m,int k,int[][] enemy) {
        // code here
        ArrayList<Integer> rows=new ArrayList<>();
        
        rows.add(-1);
        for(int[]i:enemy){
            rows.add(i[0]-1);
        }
        rows.add(n);
        Collections.sort(rows);
        
        int maxRow=0;
        for(int i=1;i<rows.size();i++){
            int prev=rows.get(i-1);
            int curr=rows.get(i);
            maxRow=Math.max(maxRow,curr-prev-1);
        }
        
        
        ArrayList<Integer> cols=new ArrayList<>();
        cols.add(-1);
        for(int[]i:enemy){
            cols.add(i[1]-1);
        }
        cols.add(m);
        Collections.sort(cols);
        
        
        int maxCol=0;
        for(int i=1;i<cols.size();i++){
            int prev=cols.get(i-1);
            int curr=cols.get(i);
            maxCol=Math.max(maxCol,curr-prev-1);
        }
        
        // System.out.println(maxRow);
        // System.out.println(maxCol);
        
        return maxRow*maxCol;
        
    }
}
 
