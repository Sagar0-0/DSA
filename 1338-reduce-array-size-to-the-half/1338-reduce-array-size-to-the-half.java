class Pair{
    int num;
    int freq;
    Pair(int i,int j){
        num=i;
        freq=j;
    }
}
class Solution {
    public int minSetSize(int[] arr) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->b.freq-a.freq);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.add(new Pair(entry.getKey(),entry.getValue()));
        }
        
        int ans=0;
        int size=arr.length;
        int sz=arr.length;
        while(sz>size/2){
            ans++;
            Pair p=pq.remove();
            sz-=p.freq;
        }
        return ans;
    }
}