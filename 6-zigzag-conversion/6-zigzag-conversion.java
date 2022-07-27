class Solution {
    public String convert(String s, int numRows) {
        int strlen = s.length();
    int n = numRows;
    StringBuilder sub = new StringBuilder();
    if(n==1 || n > strlen) {
      return s;
    }
    for (int i = 0; i < n; i++) {
      int k = i;
      if(i==0 || i == n-1) {
        while(k<strlen) {
          sub.append(s.charAt(k));
          k+= (n-1)*2;
        }
      } else {
        sub.append(s.charAt(k));
        while(k<strlen) {
          int j = k+ ((n-1)*2 - 2*i);
          if(j<strlen) {
            sub.append(s.charAt(j));
          }
          k+= (n-1)*2;
          if(k<strlen) {
            sub.append(s.charAt(k));
          }
        }
      }
    }
        return sub.toString();
    }
}