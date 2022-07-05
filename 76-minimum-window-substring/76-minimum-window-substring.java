class Solution {
    public String minWindow(String s, String t) {
        int[] cs = new int[256];
        for (char ch : t.toCharArray()) {
            cs[ch]++;
        }
        int l = 0, r = 0, cnt = t.length();
        int start = -1, end = s.length(); // substring [start, end)
        while (r < s.length()) {
            if (cs[s.charAt(r++)]-- > 0) {
                cnt--;
            }
            while (cnt == 0) {
                if (cs[s.charAt(l++)]++ == 0) {
                    cnt++;
                }
                if (r - l + 1 < end - start) {
                    start = l - 1;
                    end = r;
                }
            }
        }
        return end - start > s.length() ? "" : s.substring(start, end);
    }
}