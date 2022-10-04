/*
Implement wildcard pattern matching with support for '?' and '*'.

'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") ? false
isMatch("aa","aa") ? true
isMatch("aaa","aa") ? false
isMatch("aa", "*") ? true
isMatch("aa", "a*") ? true
isMatch("ab", "?*") ? true
isMatch("aab", "c*a*b") ? false
 */

/**
 * Approach 1: Recursion (Time Limit Exceeded)
 * Regular Expression Matching

 */
class Solution {
    public boolean isMatch(String s, String p) {
        return process(s.toCharArray(), p.toCharArray(), 0, 0);
    }

    private boolean process(char[] s, char[] p, int i, int j) {
       
        if (j == p.length) {
            return i == s.length;
        }

        if (i == s.length) {
            for (; j < p.length; j++) {
                if (p[j] != '*') {
                    return false;
                }
            }
            return true;
        }


        if (p[j] == '?' || s[i] == p[j]) {
            return process(s, p, i + 1, j + 1);
        } 

        else if (p[j] == '*') {
            return (process(s, p, i, j + 1) || process(s, p, i + 1, j));
        } 

        else {
            return false;
        }
    }
}

/**
 * Approach 2: DP
 * Time Complexity:O(mn)
 */
class Solution {
    public boolean isMatch(String s, String p) {
        char[] sArray = s.toCharArray();
        char[] pArray = p.toCharArray();
        int slen = sArray.length, plen = pArray.length;
        boolean[][] dp = new boolean[slen + 1][plen + 1];

        // Initialize the last column
        dp[slen][plen] = true;
        // Initialize the last row
        for (int j = plen - 1; j >= 0; j--) {
            if (pArray[j] == '*') {
                dp[slen][j] = true;
            } else {
                break;
            }
        }

        // Function
        for (int i = slen - 1; i >= 0; i--) {
            for (int j = plen - 1; j >= 0; j--) {
                if (pArray[j] == sArray[i] || pArray[j] == '?') {
                    dp[i][j] = dp[i + 1][j + 1];
                } else if (pArray[j] == '*') {
                    dp[i][j] = dp[i + 1][j] || dp[i][j + 1];
                } else {
                    dp[i][j] = false;
                }
            }
        }

        return dp[0][0];
    }
}

/**
 * Approach 3: Two Pointers
 * The basic idea is to have one pointer for the string and one pointer for the pattern.
 * 
 * We need the traverse the String and compare the sth character in String with the pth character in pattern.
 * There are only four situation here:
 *  1. str.charAt(s) == pattern.charAt(p)
 *  In this situation, we need move pNode and sNode to the next position and continue the process.
 *  2. str.charAt(s) != pattern.charAt(p) && pattern.charAt(p) == '?'.
 *  Cuz '?' Matches any single character, the situation is the same as situation 1. sNode++ and pNode++ then continue the process.
 *  3. str.charAt(s) != pattern.charAt(p) && pattern.charAt(p) == '*'.
 *  Cuz '*' Matches any sequence of characters.
 *  Here, we use starIndex to store the current position of pNode (the position of character '*')
 *  and use match to store the current position of sNode (the starting position of String to match '*').
 *  Then we only need to move the pNode to the next position (cuz '*' can alsoo matches the empty sequence, sNode needn't to move).
 *  4. str.charAt(s) != pattern.charAt(p) && starIndex != -1.
 *  It means that we have encountered a '*' in pattern and we stored the position of it.
 *  If the character in String has matched the '*' already, the match will move to the next position (match++), then sNode = match.
 *  This is very important, you can think about this case: String - "abcdabcd", Pattern - "a*bcd" then you will understand it.
 *  Set pNode as the next position of '*' (pNode = starIndex + 1).
 *  if the situation isn't in above, we will return false.
 * After traverse the String, we also need to check for remaining characters in pattern.
 * If the remaining character is '*', then p++.
 * At the end, we only need to check whether the pNode has traverse to the end or not.
 *
 * Time complexity is O(p*s), where p and s are the lengths of the pattern and input strings. 
 */
class Solution {
    public boolean isMatch(String str, String pattern) {
        int s = 0, p = 0, match = 0, starIndex = -1;
        while (s < str.length()) {
            // advancing both pointers
            if (p < pattern.length() && (pattern.charAt(p) == '?'
                    || str.charAt(s) == pattern.charAt(p))) {
                s++;
                p++;
            }
            // '*' found, only advancing pattern pointer
            else if (p < pattern.length() && pattern.charAt(p) == '*') {
                starIndex = p;
                match = s;
                p++;
            }
            // we have store a '*' position in pattern string, advancing string pointer
            else if (starIndex != -1) {
                p = starIndex + 1;
                match++;
                s = match;
            }
            // current pattern pointer is not star, last patter pointer was not '*'
            // characters do not match
            else {
                return false;
            }
        }

        // check for remaining characters in pattern
        while (p < pattern.length() && pattern.charAt(p) == '*') {
            p++;
        }

        return p == pattern.length();
    }
}