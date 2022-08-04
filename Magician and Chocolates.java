public class Solution {
    public int nchoc(int A, ArrayList<Integer> B) {
        Queue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        pq.addAll(B);
        int ans=0;
        int mod=1000000007;
        while(A-->0){
            int ele=pq.remove();
            ans=(ans%mod +ele%mod)%mod;
            pq.add(ele/2);
        }
        return ans;
    }
}
