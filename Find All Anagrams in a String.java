class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int ns = s.length(), np = p.length();
        List<Integer> results = new ArrayList<>();
        int[] charMap = new int[26];
        
        for (char c:p.toCharArray()) {
            charMap[c - 'a']++;
        }
        
        for (int i = 0; i < ns; i++) {
            char c = s.charAt(i);
            charMap[c - 'a']--;
            if (i >= np) {
                char last = s.charAt(i - np);
                charMap[last - 'a']++;
            }
            
            if (i >= np - 1) {
                boolean valid = true;
                for (int j = 0; j < 26; j++) {
                    if (charMap[j] != 0) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    results.add(i - np + 1);
                }
            }
        }
        
        return results;
    }
}
