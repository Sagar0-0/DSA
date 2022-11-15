public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        HashMap<HashMap<Character,Integer>,Integer> map=new HashMap<>();
        int listIndex=0;
        for(int i=0;i<A.size();i++){
            String s=A.get(i);
            HashMap<Character,Integer> curr=new HashMap<>();
            for(char c:s.toCharArray())curr.put(c,curr.getOrDefault(c,0)+1);
            if(!map.containsKey(curr)){
                map.put(curr,listIndex);
                ans.add(new ArrayList<>());
                ans.get(listIndex).add(i+1);
                listIndex++;
            }else{
                int idx=map.get(curr);
                ans.get(idx).add(i+1);
            }
        }
        return ans;
    }
}
