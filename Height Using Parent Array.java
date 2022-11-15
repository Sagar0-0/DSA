class Solution{
    static int findHeight(int N, int arr[]){
        int h=1;
        int k=arr[N-1];
        while(arr[k]!=-1){
            k=arr[k];
            h++;
        }
        return h+1;
    }
}
