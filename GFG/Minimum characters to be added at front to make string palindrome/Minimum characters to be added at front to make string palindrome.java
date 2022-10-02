class Solution {
    public static int minChar(String str) {
       //Write your code here
      int i =0, j = str.length()-1, last = j, ans =0;
      while(i < j){
          if(str.charAt(i) == str.charAt(j)){
              i++;
              j--;
          }else{
              ans++;
              i = 0;
              j = --last;
          }
      }
      return ans;
    }
    
}
