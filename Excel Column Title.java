public class Solution {
    public String convertToTitle(int n) {
        String ans="";
        while(n!=0){
            n--;
            int rem=n%26;
            ans=(char)(rem+65)+ans;
            n=n/26;
        }
        return ans;
    }
}
