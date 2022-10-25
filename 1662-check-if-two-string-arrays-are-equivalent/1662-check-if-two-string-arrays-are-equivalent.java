class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        
        int len=Math.max(word1.length , word2.length);
        for(int i = 0 ; i < len ; i++){
            if(i < word1.length){
                s1.append(word1[i]);
            }
            if(i<word2.length){
                s2.append(word2[i]);
            }
        }
        
        return (s1.toString()).equals(s2.toString());
    }
}