class Solution
{
    public int Maximum_Sum(int mat[][],int N,int K){
        // Your code goes here
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=N-K;i++){
            for(int j=0;j<=N-K;j++){
                max=Math.max(max,sum(mat,i,j,K));
            }
        }
        return max;
    }
    public int sum(int[][]arr,int row, int col, int k){
        int sum=0;
        int i=row;
        while(i<row+k){
            int j=col;
            while(j<col+k){
                sum+=arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    
}
