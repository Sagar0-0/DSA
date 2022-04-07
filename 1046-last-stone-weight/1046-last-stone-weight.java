class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            pq.add(i);
        }
        while(pq.size()>1){
            int a=pq.remove();
            int b=pq.remove();
            int curr=a-b;
            if(curr>0){
                pq.add(curr);
            }
        }
        if(pq.size()==0)return 0;
        return pq.remove();
    }
}