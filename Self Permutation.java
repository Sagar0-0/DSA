public class Solution {
    public int permuteStrings(String A, String B) {
        HashMap<Character, Integer> hm = new HashMap<>();

        if(A.length()!=B.length()) return 0;

        for(int i=0; i<A.length(); i++)
        {
            char val = A.charAt(i); 
            hm.put(val, hm.getOrDefault(val, 0)+1);
        }

        for(int i=0; i<B.length(); i++)
        {
            char val = B.charAt(i);
            if(!hm.containsKey(val)) return 0;
            if(hm.get(val)==0) hm.remove(val);
            else hm.put(val, hm.get(val)-1);
        }
        return 1;
    }
}

