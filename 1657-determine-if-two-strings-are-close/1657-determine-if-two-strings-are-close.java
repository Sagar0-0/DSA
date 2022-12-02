class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())return false;
        int[]a=new int[26];
        int[]b=new int[26];
        for(char c:word1.toCharArray()){
            a[c-'a']++;
        }
        for(char c:word2.toCharArray()){
            b[c-'a']++;
        }
        int[]needFreq=new int[word1.length()+1];
        for(int i=0;i<26;i++){
            if(b[i]!=0){
                if(a[i]==0)return false;
                needFreq[b[i]]++;
                needFreq[a[i]]--;
            }
        }
        for(int i:needFreq){
            if(i!=0)return false;
        }
        return true;
    }
}