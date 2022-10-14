class Complete{
    
   
    // Function for finding maximum and value pair
    public static int maximizeSum (int arr[], int n) {
        //Complete the function
        int[] map=new int[100001];
        for(int x:arr){
            map[x]++;
        }
        int sum=0;
        for(int i=n-1;i>=0;i--){
            int curr=arr[i];
            if(map[curr]!=0){
                sum+=curr;
                map[curr]--;
                if(map[curr-1]!=0){
                    map[curr-1]--;
                }
            }
            
        }
        return sum;
    }
    
    
