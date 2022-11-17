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



// Method 2

class Solution {

    long countSubarray(int arr[], int n, int k) {

        // code here
        int dy[]=new int[n];
        int zero=-1;
        for(int i=0;i<n;i++) {
            if(arr[i]>k) dy[i]=n-i;
            else {
                dy[i]=zero;
                zero-=1;
            }
        }
        
        long ans=0;
        long curZero=0;
        long zeros=0;
        for(int i=0;i<n;i++) {
            if(dy[i]>0)  {
                curZero=zeros;
                ans+=dy[i]+curZero;
            }
            else  {
                ans+=curZero;
                zeros=Math.abs(dy[i]);
            }
        }
        return ans;
    }
}
