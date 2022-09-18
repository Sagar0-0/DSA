class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> ans=new ArrayList<>();
        Map<String,Integer> map= new HashMap<>();
        int idx=0;
        for(String word:words){
            StringBuilder sb=new StringBuilder(word);
            map.put(sb.reverse().toString(),idx++);
        }
        for(int i=0;i<words.length;i++){
            String word=words[i];
            for(int j=0;j<=word.length();j++){
                String s1=word.substring(0,j);
                String s2=word.substring(j);
                if(map.containsKey(s1) && map.get(s1)!=i && isPal(s2)){
                    List<Integer> curr=new ArrayList<>();
                    curr.add(i);
                    curr.add(map.get(s1));
                    ans.add(curr);
                }
                if(!s1.isEmpty() && map.containsKey(s2) && map.get(s2)!=i && isPal(s1)){
                    List<Integer> curr=new ArrayList<>();
                    curr.add(map.get(s2));
                    curr.add(i);
                    ans.add(curr);
                }
                
            }
        }
        return ans;
    }
    boolean isPal(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}