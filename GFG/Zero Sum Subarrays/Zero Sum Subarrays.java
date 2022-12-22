class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        Map<Long,Long> map=new HashMap<>();
        map.put(0L,1L);
        long sum=0;
        long ans=0;
        for(long i:arr){
            sum+=i;
            if(map.containsKey(sum)){
                ans+=map.get(sum);
            }
            map.put(sum,map.getOrDefault(sum,0L)+1);
        }
        return ans;
    }
}
