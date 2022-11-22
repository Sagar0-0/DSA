class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j= s.length()-1;
        while(i<j){
            char a=s.charAt(i);
            char b=s.charAt(j);
            if(!Character.isLetterOrDigit(a)){
                i++;
            }else if(!Character.isLetterOrDigit(b)){
                j--;
            }else{
                if(Character.isUpperCase(a)){
                    a=Character.toLowerCase(a);
                }
                if(Character.isUpperCase(b)){
                    b=Character.toLowerCase(b);
                }
                if(a==b){
                    i++;
                    j--;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}