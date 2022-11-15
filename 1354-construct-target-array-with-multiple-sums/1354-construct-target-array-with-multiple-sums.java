class Solution {
    public boolean isPossible(int[] target) {
        long sum=0;
        int n=target.length;
        Queue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:target){
            sum+=i;
            pq.add(i);
        }
        while(sum!=n){
            int largest=pq.remove();
            sum-=largest;
            if(sum==1 || largest==1)return true;
            if(sum>largest || sum==0 || largest%sum==0)return false;
            largest%=sum;
            sum+=largest;
            pq.add(largest);
        }
        return true;
    }
}