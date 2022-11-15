class Solution {
    public static int findMinTime(int n, int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int l=arr[0];
        int h=arr[x-1]*n*(n+1)/2;
        int time=0;
        while(l<=h){
            int mid=(l+h)/2;
            if(isPossible(mid,n,arr)){
                time=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return time;
    }
    static boolean isPossible(int mid,int n,int[]arr){
        int donots=0;
        for(int t:arr){
            int timeTaken=0;
            int timeWillTake=t;
            while(timeTaken+timeWillTake<=mid){
                donots++;
                timeTaken+=timeWillTake;
                timeWillTake+=t;
            }
        }
        return donots>=n;
    }
}
        
