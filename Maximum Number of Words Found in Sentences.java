class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s:sentences){
            int cur=1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    cur++;
                }
            }
            max=Math.max(max,cur);
        }
        return max;
    }
}
