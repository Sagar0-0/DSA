class Complete{
    // Function for finding maximum and value pair
    public static int maximumSum (int n, int m, int arr[][]) {
        //Complete the function
        int sum=0;
        int lastMax=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            int[]a=arr[i];
            int val=limitMax(a,lastMax);
            if(val==0)return 0;
            sum+=val;
            lastMax=val;
        }
        return sum;
    }
    public static int limitMax(int[]a,int lastMax){
        Arrays.sort(a);
        for(int i=a.length-1;i>=0;i--){
            if(a[i]<lastMax){
                return a[i];
            }
        }
        return 0;
    }
}
