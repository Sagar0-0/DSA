class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:piles){
            pq.add(i);
        }
        while(k-->0){
            int ele=pq.remove();
            ele-=(ele/2);
            pq.add(ele);
        }
        int sum=0;
        while(pq.size()>0)sum+=pq.remove();
        return sum;
    }
}