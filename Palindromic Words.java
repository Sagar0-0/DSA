public class Solution {
    public int solve(String A) {
        int ans=0;
        String[]arr=A.split(" ");
        for(String a:arr){
            if(isPalindrome(a))ans++;
        }
        return ans;
    }
    boolean isPalindrome(String str){
 
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }
}
