class Solution {
    //gou
    public int uniqueMorseRepresentations(String[] words) {

        String[] MORSE = new String[]{
            ".-","-...","-.-.","-..",".","..-.","--.",
            "....","..",".---","-.-",".-..","--","-.",
            "---",".--.","--.-",".-.","...","-","..-",
            "...-",".--","-..-","-.--","--.."};
        
        Set<String> uniqueSet = new HashSet<>();
        for (String word : words) {
            uniqueSet.add(convertToMorseStr(MORSE, word));
        }
        
        return uniqueSet.size();
    }
    
    private String convertToMorseStr(String[] MORSE, String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            sb.append(MORSE[word.charAt(i)-'a']);
        }
        return sb.toString();
    }
    
    
}