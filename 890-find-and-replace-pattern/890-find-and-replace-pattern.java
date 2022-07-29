class Solution {
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list=new LinkedList<>();
        for(int i=0;i<words.length;i++){
            if(checkPattern(words[i],pattern)){
                list.add(words[i]);
            }
        }
        return list;
    }
    private static boolean checkPattern(String word, String pattern){
        for(int i=0;i<word.length();i++){
            if(word.indexOf(word.charAt(i))!=pattern.indexOf(pattern.charAt(i)))
                 return false;
        }
        return  true;
    }
}