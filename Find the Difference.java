class Solution {
    public char findTheDifference(String s, String t) {
        int diff = 0;
        int i = 0;
        for( i = 0; i < s.length(); i++) {
            diff = diff ^ s.charAt(i) ^ t.charAt(i);
        }
        diff = diff ^ t.charAt(i);
        return (char) diff;
    }
}
