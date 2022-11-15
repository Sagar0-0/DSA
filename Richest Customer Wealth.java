class Solution {
    public int maximumWealth(int[][] a) {
        int max=0;
        for(int i=0;i<a.length;i++){
            max=Math.max(max,sum(a,i));
        }
        return max;
    }
    public int sum(int[][]a,int i){
        int sum=0;
        for(int j=0;j<a[i].length;j++){
            sum+=a[i][j];
        }
        return sum;
    }
}
