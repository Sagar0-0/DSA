class Solution {
  public List<String> topKFrequent(String[] words, int k) {
        
        // map hold the word: counts
        HashMap<String, Integer> map = new HashMap();
        
        // sort the map by frequency high->low order, sort words lexi order
        PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>(
            (a,b)->{
                if(a.getValue() != b.getValue())
                    return a.getValue().compareTo(b.getValue());
                return -a.getKey().compareTo(b.getKey());
            }
        );
        
        // fill the map
        for(String word: words){
            map.merge(word, 1, Integer::sum);
        }
        
        // put into heap
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            heap.offer(entry);
            if(heap.size() > k)
                heap.poll();
        }
        
        // pop out the answer
        List<String> ans = new ArrayList();
        while(heap.size() > 0)
            ans.add(heap.poll().getKey());
        
        // check the order
        Collections.reverse(ans);
        return ans;
    }
}