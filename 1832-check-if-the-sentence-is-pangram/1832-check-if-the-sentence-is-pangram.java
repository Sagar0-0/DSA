class Solution {
    public boolean checkIfPangram(String sentence) {
        for(int i=0;i<26;i++){
            int c=(char)('a'+i);
            if(sentence.indexOf(c)==-1){
                return false;
            }
        }return true;
    }
}