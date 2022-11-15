class Solution {
    public boolean validPalindrome(String s) {
        
        int len = s.length();
        
        if(len <= 2) 
            return true;
        
        byte[] chars = s.getBytes();
        
        for(int i=0,j=len-1; i<j; i++, j--) {
            if(chars[i] != chars[j]) {
                return (valid(chars,i,j-1)) || (valid(chars,i+1,j));
            }
        }
        return true;

    }
    boolean valid(byte[] chars, int i, int j) {
        for(;i<j; i++, j--) {
            if(chars[i] != chars[j])
                return false;
        }
        return true;
    }
}