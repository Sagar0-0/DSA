class Solution {
    public void rotate(int[] a, int k) {
        int n=a.length;
        k=k%n;
        int i=0;
        int j=n-1;
        //reverse whole array
        while(i<j){
            int temp=a[j];
            a[j]=a[i];
            a[i]=temp;
            i++;
            j--;
        }
        
        //reverse upto k
        i=0;
        j=k-1;
        while(i<j){
            int temp=a[j];
            a[j]=a[i];
            a[i]=temp;
            i++;
            j--;
        }
        
        //reverse next kth part
        i=k;
        j=n-1;
        while(i<j){
            int temp=a[j];
            a[j]=a[i];
            a[i]=temp;
            i++;
            j--;
        }
    }
}
