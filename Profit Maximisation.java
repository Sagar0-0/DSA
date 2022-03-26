public class Solution {
    public int solve(int[] A, int B) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:A){
            pq.add(i);
        }
        int ans=0;
        while(B>0){
            int val=pq.remove();
            ans+=val;
            val--;
            pq.add(val);
            B--;
        }
        return ans;
    }
}
