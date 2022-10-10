class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length() == 1){
            return "";
        }
        StringBuilder sb = new StringBuilder(palindrome);
        int low = 0;
        int high = palindrome.length() - 1;
        int mid = (palindrome.length() / 2 ) - 1;

        while(low <= mid){
            if(sb.charAt(low) != 'a'){
                sb.setCharAt(low,'a');
                return sb.toString();
            }
            low++;
        }

        sb.setCharAt(high,'b');
        return sb.toString();
        
    }
}