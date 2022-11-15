public class Solution {
    public int calculateMinimumHP(int[][] A) {
        
        int m=A.length;
        int n=A[0].length;
        
        A[m-1][n-1]=Math.max(1,-1*A[m-1][n-1]+1);
        
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                
                if(i==m-1 && j==n-1){
                    continue;
                }else if(i==m-1){
                    A[i][j]=Math.max(1,A[i][j+1]-A[i][j]);
                }else if(j==n-1){
                    A[i][j]=Math.max(1,A[i+1][j]-A[i][j]);
                }else{
                    A[i][j]=Math.max(1,Math.min(A[i+1][j],A[i][j+1])-A[i][j]);
                }
                
            }
        }
        
        return A[0][0];
    }
}

