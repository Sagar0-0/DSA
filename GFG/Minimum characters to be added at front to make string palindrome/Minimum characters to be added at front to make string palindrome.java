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

//=====================================================
// class Solution {
//     public static int minChar(String s) {
//        //Write your code here
//        int i=0;
//        int j=s.length()-1;
//        int ans=0;
//        while(i<j){
//            if(s.charAt(i)==s.charAt(j)){
//                i++;
//                j--;
//            }else{
//                ans=s.length()-j;
//                i=0;
//                //reduce add
//                 while(s.charAt(i)==s.charAt(j)){
//                     ans--;
//                     i++;
//                 }
//                j--;
//            }
//        }
//        return ans;
//     }
// }
