class Solution {
    public int furthestBuilding(int[] h, int bricks, int l) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int n=h.length;
        for(int i=1;i<n;i++){
            int diff=h[i]-h[i-1];
            if(diff>0){
                if(pq.size()<l){
                    pq.add(diff);
                }else{
                    int br=diff;
                    if(pq.size()>0 && pq.peek()<diff){
                        br=pq.remove();
                        pq.add(diff);
                    }
                    
                    if(bricks>=br){
                        bricks-=br;
                    }else{
                        return i-1;
                    }
                }
            }
        }
        return n-1;
    }
}