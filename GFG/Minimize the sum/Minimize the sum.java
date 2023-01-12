class Solution {
    long minimizeSum(int N, int arr[]) {
        // code here
        long ans=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:arr){
            pq.add(i);
        }
        while(pq.size()>1){
            int curr=pq.remove()+pq.remove();
            ans+=curr;
            pq.add(curr);
        }
        return ans;
    }
}
