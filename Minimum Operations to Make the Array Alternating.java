class Solution {
    public int minimumOperations(int[] nums) {
        Map<Integer, Integer> oddMap = new HashMap<>();
        Map<Integer, Integer> evenMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(i % 2 != 0){
                oddMap.put(nums[i], oddMap.getOrDefault(nums[i], 0) + 1);
            }else{
                evenMap.put(nums[i], evenMap.getOrDefault(nums[i], 0) + 1);
            }
        }
        
        Queue<Node> odd = new PriorityQueue<>((a, b) -> b.freq - a.freq);
        Queue<Node> even = new PriorityQueue<>((a, b) -> b.freq - a.freq);
        for(Map.Entry<Integer, Integer> entry : oddMap.entrySet()){
            odd.offer(new Node(entry.getKey(), entry.getValue()));
        }
        for(Map.Entry<Integer, Integer> entry : evenMap.entrySet()){
            even.offer(new Node(entry.getKey(), entry.getValue()));
        }
        
        while(!odd.isEmpty() && !even.isEmpty() && odd.peek().val == even.peek().val){
            if(odd.peek().freq < even.peek().freq){
                odd.poll();
            }else{
                even.poll();
            }
        }
        
        int n = nums.length;
        if(n % 2 == 0){
            return (odd.isEmpty() ? n / 2 : n / 2 - odd.poll().freq) + (even.isEmpty() ? n / 2 : n / 2 - even.poll().freq);
        }else{
            return (odd.isEmpty() ? n / 2 + 1 : n / 2 + 1 - odd.poll().freq) + (even.isEmpty() ? n / 2 : n / 2 - even.poll().freq);
        }
    }
    
    class Node {
        int freq;
        int val;
        public Node(int val, int freq){
            this.freq = freq;
            this.val = val;
        }
        public String toString(){
            return val + ": " + freq;
        }
    }
}
