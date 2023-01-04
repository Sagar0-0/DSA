class Solution {
    public static int maximum_profit(int n, int[][] arr) {
        // code here
        Arrays.sort(arr,(a,b)->{
           if(a[0]!=b[0]) return a[0]-b[0];
           return a[1]-b[1];
        });
        int[]dp=new int[n];
        return rec(0,arr,n,dp);
    }
    static int rec(int index,int[][]arr,int n,int[]dp){
        if(index>=n)return 0;
        if(dp[index]!=0)return dp[index];
        int not_select=rec(index+1,arr,n,dp);
        int nextIndex = findNext(index+1,arr[index][1],arr,n);
        int select = arr[index][2] + rec(nextIndex,arr,n,dp);
        return dp[index]=Math.max(select,not_select);
    }
    static int findNext(int i,int prevEnd,int[][]arr,int n){
        while(i<n){
            if(arr[i][0]>=prevEnd){
                break;
            }else{
                i++;
            }
        }
        return i;
    }
}
