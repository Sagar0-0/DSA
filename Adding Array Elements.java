class Solution {
    int minOperations(int[] arr, int n, int k) {
        // code here
        if(n==1)return 0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:arr)pq.add(i);
        int count=0;
        while(pq.size()>1){
            if(pq.peek()>=k)break;
            int f=pq.remove();
            int s=pq.remove();
            int sum=f+s;
            count++;
            pq.add(sum);
        }
        if(pq.peek()<k)return -1;
        return count;
    }
}
