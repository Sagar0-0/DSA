class Solution {
    public int[][] diagonalSort(int[][] mat) {
      int m=mat.length,n=mat[0].length;
      //row=0
        for(int col=0;col<n;col++){
            sort(mat,0,col,m,n);
        }
        //col=0
        for(int row=0;row<m;row++){
            sort(mat,row,0,m,n);
        }
        return mat;
    }
    public static void sort(int[][] mat,int row,int col,int m,int n){
        int[] values=new int[101];//using count sort
        int r=row,c=col;
        while(r<m&&c<n){
            values[mat[r][c]]++;
            r++;
            c++;
        }
        r=row;
        c=col;
        for(int i=1;i<101;i++){
            if(values[i]>0){
                int cnt=values[i];
                while(cnt-->0){
                    mat[r][c]=i;
                    r++;c++;
                }
            }
        }
    }
}