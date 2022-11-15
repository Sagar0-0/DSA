class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int []ans=new int[k];
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int[]a=new int[]{entry.getKey(),entry.getValue()};
            pq.add(a);
        }
        int i=0;
        while(i<k){
            ans[i]=pq.remove()[0];
            i++;
        }
        return ans;
    }
}