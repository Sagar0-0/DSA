class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n=costs.length;
        int[][]diff=new int[n][3];
        for(int i=0;i<n;i++){
            int dif=costs[i][1]-costs[i][0];
            diff[i]=new int[]{dif,costs[i][0],costs[i][1]};
        }
        Arrays.sort(diff,(o1,o2)->o1[0]-o2[0]);
        int ans=0;
        for(int i=0;i<n;i++){
            if(i>=n/2){
                ans+=diff[i][1];
            }else{
                ans+=diff[i][2];
            }
        }
        return ans;
    }
}