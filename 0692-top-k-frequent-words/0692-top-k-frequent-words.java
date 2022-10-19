class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int maxFreq=0;
        Map<String,Integer> map=new HashMap<>();
        for(String s:words){
            maxFreq=Math.max(maxFreq,map.getOrDefault(s,0)+1);
            map.put(s,map.getOrDefault(s,0)+1);
        }
        Map<Integer,PriorityQueue<String>> map2=new HashMap<>();
        for(String s:words){
            if(!map.containsKey(s))continue;
            int freq=map.get(s);
            map.remove(s);
            map2.putIfAbsent(freq,new PriorityQueue());
            map2.get(freq).add(s);
        }
        List<String>ans=new ArrayList<>();
        while(maxFreq>0){
            if(!map2.containsKey(maxFreq)){
                maxFreq--;
                continue;
            }
            PriorityQueue<String> pq=map2.get(maxFreq);
            maxFreq--;
            while(!pq.isEmpty()){
                ans.add(pq.poll());
                if(ans.size()==k)break;
            }
            if(ans.size()==k)break;
        }
        return ans;
    }
}