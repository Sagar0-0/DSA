class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
           if(a[0]==b[0])return a[1]-b[1];
            return a[0]-b[0];
        });
        int count=0;
        int n=people.length;
        int[][]ans=new int[n][2];
        for(int i=0;i<n;i++){
            ans[i][0]=-1;
        }
        for(int i=0;i<n;i++){
            count=people[i][1];
            for(int j=0;j<n;j++){
                if(ans[j][0]==-1 && count==0){
                    ans[j][0]=people[i][0];
                    ans[j][1]=people[i][1];
                    break;
                }else if(ans[j][0]==-1 || ans[j][0]>=people[i][0]){
                    count--;
                }
            }
        }
        return ans;
    }
}