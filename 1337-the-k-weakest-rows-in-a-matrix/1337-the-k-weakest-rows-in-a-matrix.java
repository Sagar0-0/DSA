class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[]ans=new int[k];
        int[][]freq=new int[mat.length][2];
        for(int i=0;i<mat.length;i++){
            freq[i]=new int[]{count(mat,i),i};
        }
        Arrays.sort(freq,(o1,o2)->o1[0]-o2[0]);
        for(int i=0;i<k;i++){
            ans[i]=freq[i][1];
        }
        return ans;
    }
    public int count(int[][]mat,int i){
        int ans=0;
        for(int j=0;j<mat[i].length;j++){
            if(mat[i][j]==0)break;
            ans+=mat[i][j];
        }
        return ans;
    }
}