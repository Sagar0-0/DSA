class Solution {
    public long minIncrements(int[] arr, int N) {
        // Code here
        Arrays.sort(arr);
        int ans=0;
        for(int i=1;i<N;i++){
            if(arr[i-1]>=arr[i]){
                ans+=arr[i-1]-arr[i]+1;
                arr[i]=arr[i-1]+1;
            }
        }
        return ans;
    }
}
