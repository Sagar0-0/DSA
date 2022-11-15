class Solution {
    int x;
    public boolean searchMatrix(int[][] matrix, int target) {
        x=target;
        int i=0;
        int n=matrix.length;
        int m=matrix[0].length;
        while(i<n){
            if(matrix[i][0]<=x && matrix[i][m-1]>=x){
                return binarySearch(matrix,i);
            }else{
                i++;
            }
        }
        return false;
    }
    public boolean binarySearch(int[][]matrix,int i){
        int[]a=matrix[i];
        int l=0;
        int h=a.length;
        while(l<=h){
            int mid=(l+h)/2;
            if(a[mid]==x){
                return true;
            }else if(a[mid]<x){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return false;
    }
}