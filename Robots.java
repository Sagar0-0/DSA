class Solution {
    public String moveRobots(String s1, String s2) {
        int i = 0, j = 0, n = s1.length();
        while(i < n && j < n) {
            if(s1.charAt(i) == '#') {
                i++;
            }
            else if(s2.charAt(j) == '#') {
                j++;
            }
            else if(s1.charAt(i) != s2.charAt(j)) {
                return "No";
            }
            else if(s1.charAt(i) == 'B' && i > j) {
                return "No";
            }
            else if(s1.charAt(i) == 'A' && i < j) {
                return "No";
            }
            else {
                i++;
                j++;
            }
        }
        return "Yes";
    }
}
