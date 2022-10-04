class Solution {
    static int palindromepair(int N, String arr[]) {
        for(int i = 0; i< N;i++){
            for(int j =0; j< N;j++){
                if(i!=j){
                    String newStr = arr[i]+arr[j];
                    if(isPalindrome(newStr)) return 1;
                }
            }
        }
        return 0;
    }
    
    
    static boolean isPalindrome(String input){
        int i = 0;
        int j = input.length() - 1;
 
        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
 
        return true;
    }
};
