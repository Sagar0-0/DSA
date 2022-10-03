class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        int len=n/2;
        if(n%2 != 0){
            for(int i=0 ; i<len ; i++){
                arr[i]= i+1;
                arr[i+len] = -(i+1);
            }
            arr[n-1] = 0;
        }
        else{
            for(int i=0 ; i<len ; i++){
                arr[i]= i+1;
                arr[i+len] = -(i+1);
            }
        }
        return arr;
    }
}
