class Solution { 
    int minSubset(int[] arr,int n) { 
        Arrays.sort(arr);
       long sum=0;
       for(int i=0;i<n;i++){
           sum=sum+arr[i];
       }
       long sum2=0;
       int index=n-1;
       int count=0;
       while(sum2<=sum){
           sum2=sum2+arr[index];
           sum=sum-arr[index];
           index--;
           count++;
           
       }
       return count;
        
    }
}
