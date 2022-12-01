class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
        int l=0;
        int r=n-1;
        long mod=1000001;
        for(int i=0;i<n;i++){
            if(i%2==0){
                long newValue=arr[r]%mod;
                arr[i]=newValue*mod+arr[i];
                r--;
            }else{
                long newValue=arr[l]%mod;
                arr[i]=newValue*mod+arr[i];
                l++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]/mod;
        }
        
    }
    
}
