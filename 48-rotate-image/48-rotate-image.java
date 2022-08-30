class Solution {
    public void rotate(int[][] matrix) {
        
        /**
        solution in place 
        
        1. do transpose
        2. reverse the row element
        
        */
        Transpose(matrix)
        ReverseRow(matrix);
    }
    
    public void Transpose(int[][] m){
        
        int row=m.length;
        int col=m[0].length;
        
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                
                if(i!=j){
                    int temp=m[i][j];
                    m[i][j]=m[j][i];
                    m[j][i]=temp;
                }
                    
            }
        }
    }
    
    public void ReverseRow(int[][] matrix){
       
        int s=0;
        int e=matrix[0].length-1;
        
      while(s<e){
         
          
          for(int row=0;row<matrix[0].length;row++){
              int temp=matrix[row][s];
              matrix[row][s]=matrix[row][e];
              matrix[row][e]=temp; 
          }
          s++;
          e--;
      }
    }
}
