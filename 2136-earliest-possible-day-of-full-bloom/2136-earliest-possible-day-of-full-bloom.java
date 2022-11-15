class Solution {
    class Pair{
        int plantTime;
        int growTime;
        Pair(int a,int b){
            plantTime=a;
            growTime=b;
        }
    }
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->b.growTime-a.growTime);
        for(int i=0;i<plantTime.length;i++){
            pq.add(new Pair(plantTime[i],growTime[i]));
        }
        int ans=0;
        int currTime=0;
        while(!pq.isEmpty()){
            Pair p=pq.remove();
            int time=currTime+p.plantTime + p.growTime;
            ans=Math.max(ans,time);
            currTime+=p.plantTime;
        }
        return ans;
    }
}