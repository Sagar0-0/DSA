class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String w : words){
            int c = map.getOrDefault(w,0);
            c++;
            map.put(w,c);
        }
        Queue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b)->(a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()) : (a.getValue()-b.getValue())*-1));

        for(Map.Entry<String,Integer> e : map.entrySet()){
            pq.offer(e);
        }
        List<String> result = new ArrayList<>();
        while(k > 0){
            k--;
            result.add(pq.poll().getKey());
        }
        return result;

    }
}