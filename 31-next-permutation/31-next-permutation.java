class Solution {
    public void nextPermutation(int[] a) {
        int N=a.length;
        int k=-1;
        for(int i=0;i<N-1;i++){
            if(a[i]<a[i+1]){
                k=i;
            }
        }
        if(k==-1){
            reverse(a,0,N-1);
            return;
        }
        int l=k+1;
        for(int i=k+1;i<N;i++){
            if(a[i]>a[k]){
                l=i;
            }
        }
        int temp=a[k];
        a[k]=a[l];
        a[l]=temp;
        reverse(a,k+1,N-1);
    }
    public void reverse(int[]a,int i,int j){
        while(i<=j-1){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
}