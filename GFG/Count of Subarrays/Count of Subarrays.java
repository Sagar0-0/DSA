class Solution {

    long countSubarray(int arr[], int n, int k) {
        long ans=0;
        int recent=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>k){
                ans++;
                int left=i-(recent+1);
                int right=n-1-i;
                ans+=left;
                ans+=right;
                ans+=(left*right);
                recent=i;
            }
        }
        return ans;
    }
}
