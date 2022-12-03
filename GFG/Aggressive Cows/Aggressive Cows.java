class Solution {
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int l=1;
        int h=stalls[n-1]-stalls[0];
        while(l<=h){//log (10^9)== 9*log(10) = 30
            int mid=(l+h)/2;
            if(isPossible(k,stalls,mid)){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return h;// (n)
    }
    static boolean isPossible(int k,int[]arr,int minDis){
        int cnt=1;
        int prevCow=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-prevCow>=minDis){
                prevCow=arr[i];
                cnt++;
            }
        }
        return cnt>=k;
    }
}
