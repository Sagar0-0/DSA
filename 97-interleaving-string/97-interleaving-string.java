class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        boolean[][] canReach = new boolean[s1.length()][s2.length()];
        return isInterleaveHelper(s1, s2, s3, 0, 0, 0, canReach);
    }
    
    private boolean isInterleaveHelper(String s1, String s2, String s3, int i1, int i2, int i3, boolean[][] canReach) {
        if (i3 == s3.length()) {
            if (i1 == s1.length() && i2 == s2.length()) return true;
            return false;
        }
        if (i1 == s1.length()) {
            return s2.substring(i2, s2.length()).equals(s3.substring(i3, s3.length()));
        }
        if (i2 == s2.length()) {
            return s1.substring(i1, s1.length()).equals(s3.substring(i3, s3.length()));
        }
        if (canReach[i1][i2]) return false;
        canReach[i1][i2] = true;
        boolean s1Match = (s1.charAt(i1) == s3.charAt(i3));
        boolean s2Match = (s2.charAt(i2) == s3.charAt(i3));
        if (s1Match && s2Match) {
            return isInterleaveHelper(s1, s2, s3, i1 + 1, i2, i3 + 1, canReach) || isInterleaveHelper(s1, s2, s3, i1, i2 + 1, i3 + 1, canReach);
        }
        else if (s1Match) {
            return isInterleaveHelper(s1, s2, s3, i1 + 1, i2, i3 + 1, canReach);
        }
        else if (s2Match) {
            return isInterleaveHelper(s1, s2, s3, i1, i2 + 1, i3 + 1, canReach);
        }
        else {
            return false;
        }
    }
}