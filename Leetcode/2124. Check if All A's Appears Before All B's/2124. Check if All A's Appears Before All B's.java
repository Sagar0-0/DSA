Code :
class Solution {
    public boolean checkString(String s) {
       int indexb=s.indexOf("b");
       int indexa=s.lastIndexOf("a");
       if(indexa!=-1 && indexb!=-1 && indexa>indexb){
           return false;
       }
       else if(indexa==-1 || indexb==-1){
           return true;
       }
        return true;
    }
}

Time Complexity:O(String Length)[As indexOf() method will found out the index of a particular character after thraversing the whole string]
Space Complexity:O(1)
Auxiliary Space:O(1)
  
Leetcode Time:1ms beats 86.26%
Leetcode Space:42.2Mb beats 42.38%
  
  
