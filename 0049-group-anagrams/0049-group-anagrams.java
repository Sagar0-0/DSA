class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Set<Map<Character,Integer>> set=new HashSet<>();
        Map<Map<Character,Integer>,Integer>map=new HashMap<>();
        List<List<String>> ans=new ArrayList<>();
        for(String s:strs){
            Map<Character,Integer> curr=new HashMap<>();
            for(char c:s.toCharArray()){
                curr.put(c,curr.getOrDefault(c,0)+1);
            }
            if(set.contains(curr)){
                int idx=map.get(curr);
                ans.get(idx).add(s);
            }else{
                set.add(curr);
                ans.add(new ArrayList<>());
                ans.get(ans.size()-1).add(s);
                map.put(curr,ans.size()-1);
            }
        }
        return ans;
    }
}