class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] a=new int[26];
        for(char c:magazine.toCharArray()){
            a[c-'a']++;
        }
        int[] b=new int[26];
        for(char c:ransomNote.toCharArray()){
            b[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(a[i]<b[i])return false;
        }
        return true;
    }
}