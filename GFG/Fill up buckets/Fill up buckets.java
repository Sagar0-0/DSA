class Solution{
    public int totalWays(int n, int[] arr) {
        // code here
        Arrays.sort(arr);
        int mod=1000000007;
        long ans=1;
        for(int i=0;i<n;i++){
            ans=(ans*(arr[i]-i))%mod;
        }
        return (int)ans%mod;
    }
}
