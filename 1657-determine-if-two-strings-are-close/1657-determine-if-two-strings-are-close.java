class Solution {
    public boolean closeStrings(String s1, String s2) {
        
        var freqs1 = new int[26];
        for(var c1: s1.toCharArray()) {
            freqs1[c1 - 'a']++;
        }
        var freqs2 = new int[26];
        for(var c2: s2.toCharArray()) {
            freqs2[c2 - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(freqs1[i]  > 0 && freqs2[i] == 0) {
                return false;
            }
            if(freqs1[i] == 0 && freqs2[i]  > 0) {
                return false; 
            }
        }
        Arrays.sort(freqs1);
        Arrays.sort(freqs2);
        return Arrays.equals(freqs1, freqs2); 
    }
}