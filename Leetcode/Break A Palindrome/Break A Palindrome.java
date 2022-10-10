class Solution{
  public String breakPalindrome(String s) {
          if(s.length()<=1){
              return "";
          }
          else{
              int len=0;
              len=s.length()/2;
              int i=0;
              StringBuilder sb=new StringBuilder(s);
              while(i<len){
                  if(s.charAt(i)!='a'){
                      sb.setCharAt(i,'a');
                      return sb.toString();
                  }

                  i++;
              }
              sb.setCharAt(s.length()-1,'b');
              return sb.toString();

          }
      }
}

Time Complexity:O(S.length()/2);
Space Complexity:O(1)
Auxiliary Space:O(1)
  
LeetCode Time:0ms faster than 100%
LeetCode Memory:40Mb less than 96.69%
