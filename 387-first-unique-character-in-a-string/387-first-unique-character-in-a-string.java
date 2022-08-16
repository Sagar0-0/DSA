class Solution {
    public int firstUniqChar(String s) {
        int ans = s.length();
        for(char c = 'a'; c <= 'z'; c++){
            int idx = s.indexOf(c);
            if(idx != -1 && idx == s.lastIndexOf(c)){
                ans = Math.min(ans, idx);
            }
        }
        return ans == s.length() ? -1 : ans;
    }
}