class Solution {
    public int kthSmallest(int[][] mat, int k) {
        int[]arr=new int[mat.length*mat[0].length];
        int idx=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                arr[idx++]=mat[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}