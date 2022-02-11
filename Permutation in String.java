class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len_s1 = s1.length(), len_s2 = s2.length();
        if (len_s1 > len_s2) return false;
        
        int[] count = new int[26];
        for (int i = 0; i < len_s1; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        if (zeroCount(count)) return true;
        
        for (int i = len_s1; i < len_s2; i++) {
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - len_s1) - 'a']++;
            if (zeroCount(count)) return true;
        }
        
        return false;
    }
    
    private boolean zeroCount(int[] count) {
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) 
                return false;
        }
        return true;
    }
}

==================================================================================================
  
  class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr=new int[26];
        for(char c:s1.toCharArray()){
            arr[(int)c-97]++;
        }
        
        int[] a=new int[26];
        for(int i=0;i<=s2.length()-s1.length();i++){
            a=arr.clone();
            boolean present=false;
            for(int j=i;j<i+s1.length();j++){
                if(a[(int)s2.charAt(j)-97]<=0){
                    present=false;
                    break;
                }else{
                    a[(int)s2.charAt(j)-97]--;
                    present=true;
                }
            }
            if(present)return present;
        }
        return false;
    }
}
