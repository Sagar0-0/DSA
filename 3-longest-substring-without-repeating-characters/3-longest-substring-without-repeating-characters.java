class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) return s.length();
        int max = 0;
        char[] split = s.toCharArray();
        int[] map = new int[256];
        for(int i = 0, j = 0; i < split.length; i++) {
            char c = split[i]; 
            j = Math.max(j, map[c]);
            map[c] = i + 1;
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}