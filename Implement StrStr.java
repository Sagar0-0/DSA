public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int strStr(final String A, final String B) {
        for(int i=0;i<=A.length()-B.length();i++){
            if(A.charAt(i)==B.charAt(0)){
                if(B.equals(A.substring(i,i+B.length()))){
                    return i;
                }
            }
        }
        return -1;
    }
}
