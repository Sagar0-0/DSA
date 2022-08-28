class Solution {
    public int[][] diagonalSort(int[][] mat) {
        for(int row=0;row<mat.length;row++){
            int limit=Math.min(mat.length-row,mat[0].length);
            if(limit==1)continue;
            ArrayList<Integer> arr=new ArrayList<>();
            int x=row;
            int y=0;
            for(int j=0;j<limit;j++){
                arr.add(mat[x][y]);
                x++;
                y++;
            }
            Collections.sort(arr);
            x=row;
            y=0;
            for(int j=0;j<limit;j++){
                mat[x][y]=arr.get(j);
                x++;
                y++;
            }
        }
        
        
        for(int col=1;col<mat[0].length;col++){
            int limit=Math.min(mat.length,mat[0].length-col);
            if(limit==1)continue;
            ArrayList<Integer> arr=new ArrayList<>();
            int x=0;
            int y=col;
            for(int j=0;j<limit;j++){
                arr.add(mat[x][y]);
                x++;
                y++;
            }
            Collections.sort(arr);
            x=0;
            y=col;
            for(int j=0;j<limit;j++){
                mat[x][y]=arr.get(j);
                x++;
                y++;
            }
        }
        return mat;
    }
}