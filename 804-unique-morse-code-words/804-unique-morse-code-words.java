class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set=new HashSet<>();
        for(String s:words){
            String morse=getMorse(s);
            set.add(morse);
        }
        return set.size();
    }
    String getMorse(String s){
        String[] m=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder ans=new StringBuilder();
        for(char c:s.toCharArray()){
            ans.append(m[c-'a']);
        }
        return ans.toString();
    }
}