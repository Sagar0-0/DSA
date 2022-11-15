public class Solution {
    public int solve(ArrayList<Integer> A) {
        Queue<Integer>pq=new PriorityQueue<>();
        for(int i:A)pq.add(i);
        int ans=0;
        while(pq.size()>1){
            int sum=pq.remove()+pq.remove();
            ans+=sum;
            pq.add(sum);
        }
        return ans;
    }
}
