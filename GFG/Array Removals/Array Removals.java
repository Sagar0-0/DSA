class Solution {
    int removals(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int i=0;
        int j=0;
        int maxSize=0;
        while(j<n){
            if(arr[j]-arr[i]<=k)j++;
            else if(i<j)i++;
            maxSize=Math.max(maxSize,j-i);
        }
        return n-maxSize;
    }
}
