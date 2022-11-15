class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int length=0;
        for(int i=0;i<N;i++){
            sum+=A[i];
            if(sum==K){
                length=i+1;
            }else if(map.containsKey(sum-K)){
                length=Math.max(length,i-map.get(sum-K));
            }
            
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return length;
    }
    
    
}
