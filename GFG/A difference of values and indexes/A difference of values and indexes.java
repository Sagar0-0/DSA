class Solution{
    
   
    // Function for finding maximum and value pair
    public static int maxDistance (int arr[], int n) {
        //Complete the function
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int max2=Integer.MIN_VALUE;
        int min2=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]+i);
            min=Math.min(min,arr[i]+i);
            
            max2=Math.max(max2,arr[i]-i);
            min2=Math.min(min2,arr[i]-i);
            
        }
        return Math.max(max-min,max2-min2);
    }
    
    
}
