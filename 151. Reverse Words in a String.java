//151. Reverse Words in a String Leetcode
class Solution {
    public String reverseWords(String s) {
       int len = s.length();
        String k = "", a = "";

        for (int i = len - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            if (currentChar != ' ' && currentChar != '.' && currentChar != ',') {
                k = currentChar + k;
            } else {
                if (!k.isEmpty()) {
                    a += (a.isEmpty() ? "" : " ") + k;
                    k = "";
                }
            }
        }

        if (!k.isEmpty()) {
            a += (a.isEmpty() ? "" : " ") + k;
        }

        return a;
    }
}
