class Solution {
    public boolean isAnagram(String s, String t) {
        char[]a1=new char[26];
        char[]a2=new char[26];
        for(char c:s.toCharArray()){
            a1[c-'a']++;
        }
        for(char c:t.toCharArray()){
            a2[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(a1[i]!=a2[i])return false;
        }
        return true;
    }
}