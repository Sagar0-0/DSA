class Solution {
    public int firstUniqChar(String s) {
        int[]freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(freq[c-'a']==1)return i;
        }
        return -1;
    }
}