class Solution {
    public int longestPalindrome(String s) {
        int[]freq=new int[123];
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        int ans=0;
        boolean hasOdd=false;
        for(int i:freq){
            if((i&1)==1){
                hasOdd=true;
                ans+=i-1;
            }else{
                ans+=i;
            }
        }
        return hasOdd?ans+1:ans;
    }
}