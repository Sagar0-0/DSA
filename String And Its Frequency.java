public class Solution {
    public String solve(String A) {
        StringBuilder sb=new StringBuilder();
        int[]freq=new int[26];
        for(char c:A.toCharArray()){
            freq[c-'a']++;
        }
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            if(freq[ch-'a']>0){
                sb.append(ch);
                sb.append(freq[ch-'a']);
                freq[ch-'a']=0;
            }
        }
        return sb.toString();
    }
}
