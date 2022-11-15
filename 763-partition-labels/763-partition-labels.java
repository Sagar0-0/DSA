class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        int[] lastIndex = new int[26];
        for (int i = 0; i < 26; i++) {
            lastIndex[i] = s.lastIndexOf('a' + i);
        }
        int left = 0;
        int right;
        while (left < s.length()) {
            right = lastIndex[s.charAt(left) - 'a'];
            for (int i = left; i < right; i++) {
                right = Math.max(right, lastIndex[s.charAt(i) - 'a']);
            }
            ans.add(right - left + 1);  // size: right -left + 1
            left = right + 1;
        }
        return ans;
    }
}