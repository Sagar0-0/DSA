class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> freq=new HashMap<>();
        for(char c:s.toCharArray()){
            freq.putIfAbsent(c,0);
            freq.put(c,freq.get(c)+1);
        }
        Map<Integer,List<Character>> map=new HashMap<>();
        int max=0;
        for(Character key:freq.keySet()){
            int val=freq.get(key);
            max=Math.max(max,val);
            map.putIfAbsent(val,new ArrayList<>());
            map.get(val).add(key);
        }
        StringBuilder sb=new StringBuilder();
        while(max>0){
            if(map.containsKey(max)){
                List<Character> list=map.get(max);
                for(char c:list){
                    int n=max;
                    while(n>0){
                        sb.append(c);
                        n--;
                    }
                }
            }
            max--;
        }
        return sb.toString();
    }
}