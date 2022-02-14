class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
       int[]ans=new int[2];
        for(int i=0;i<n;i++){
            int val=Math.abs(arr[i]);
            if(arr[val-1]<0){
                ans[0]=val;
            }else{
                arr[val-1]=0-arr[val-1];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans[1]=i+1;
                break;
            }
        }
        return ans;
    }
}
