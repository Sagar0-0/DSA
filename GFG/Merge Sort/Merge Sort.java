

class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int[] a = new int[r-l+1];
         int id1 = l;
         int id2 = m+1;
         int c = 0;
         while(id1<=m && id2<=r){
             if(arr[id1]<=arr[id2]){
                 a[c++] = arr[id1++];
             }else{
                 a[c++] = arr[id2++];
             }
         }
         while(id1<=m){
             a[c++] = arr[id1++];
         }
         while(id2<=r){
             a[c++] = arr[id2++];
         }
         for(int i=0,j=l;i<a.length;i++,j++){
             arr[j] = a[i];
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l>=r){
            return;
        }
        int mid = l + (r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
}
