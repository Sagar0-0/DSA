class Solution {
    public static int findMinTime(int n, int l, int[] arr) {
        int start=1;
        int end=Integer.MAX_VALUE;
        int ans=0;
        while(start<=end) {
            int mid=start +(end-start)/2;
            if(isAnswer(arr, mid, n)) {
                ans=mid;
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return ans;
    }
    
    public static boolean isAnswer(int arr[], int mid, int n) {
        int curAns=0;
        for(int i=0;i<arr.length;i++) {
            curAns+=getNumber(arr[i], mid);  //used Binary search using formula of Ap series of sum Sn=n(2*a+(n-1)d)/2, from formula we know a->arr[i], Sn->mid found n using binary search
            if(curAns>=n) return true;
        }
        // System.out.println(curAns+" "+n+" "+mid);
        return curAns>=n;
    }
    
    public static int getNumber(int a, int sum) {
        int start=1;
        int end=sum;
        int n=0;
        if(sum<a) return 0;
        while(start<=end) {
            long mid=start +(end-start)/2; // taken mid as long beacause (mid)*(2*a+(mid-1)*a)/2 might exceed int range
            if((mid)*(2*a+(mid-1)*a)/2>=sum) {
                n=(int)mid;
                end=(int)mid-1;
            }
            else {
                start=(int)mid+1;
            }
        }
        if(n*(2*a+(n-1)*a)/2==sum) 
            return n;
        else 
            return n-1>=0?n-1:0;
           
    }
}
