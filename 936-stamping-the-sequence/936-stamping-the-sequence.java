class Solution {
    public int[] movesToStamp(String stamp, String target) {
        char[] s = stamp.toCharArray();
        char[] t = target.toCharArray();
        int m = s.length, n = t.length, count = 0; // count chars replaced successfully

        boolean[] visited = new boolean[n];
        int[] res = new int[n];
        int top = res.length;
        while (count < n) {
            boolean stamped = false;
            for (int i = 0; i <= n - m; i++)
                if (!visited[i] && canStamp(i, s, t)) {
                    visited[i] = true;
                    // System.out.printf("%s%d\n%s\n%s%s\n\n", " ".repeat(i), i, new String(t), " ".repeat(i), new String(s));
                    count = stamp(i, s, t, count);
                    stamped = true; // successfully stamped this round
                    res[--top] = i; // add result
                    if (count == n) break; // all stamped
                }
            
            if (!stamped) return new int[0]; // nothing found, return an empty array
        }
        
        return Arrays.copyOfRange(res, top, res.length);
    }
    
    private int stamp(int start, char[] s, char[] t, int count) {
        for (int i = 0; i < s.length; i++)
            if (t[start + i] != '*') {
                t[start + i] = '*';
                count++;
            }
        
        return count;
    }
    
    private boolean canStamp(int start, char[] s, char[] t) {
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (t[start + i] == '*') count++;
            else if (t[start + i] != '*' && s[i] != t[start + i])
                return false;
        }

        return count != s.length;
    }
}

/*
Case 0:
"abc"
"abababcbcbababcbc"

    4
abababcbcbababcbc
    abc

      6
abab***bcbababcbc
      abc

            12
abab*****bababcbc
            abc

              14
abab*****bab***bc
              abc

  2
abab*****bab*****
  abc

          10
ab*******bab*****
          abc

0
ab*******b*******
abc

        8
*********b*******
        abc



Case 1:
"abc"
"ababc"

  2
ababc
  abc
  
0
ab***
abc

"abca"
"aabcaca"

 1
aabcaca
 abca
 
   3
a****ca
   abca
   
0
a******
abca

*/