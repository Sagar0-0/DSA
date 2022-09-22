class Solution{
    static String ReFormatString(String S, int K){
        StringBuilder ans = new StringBuilder();
        int cnt = 0;
        for(int i = S.length() - 1; i >= 0; i--) {
                char ch = S.charAt(i);
                if(ch != '-' && cnt < K){
                    ans.append(Character.toUpperCase(ch));
                    cnt++;
                }
                if(cnt==K){
                    cnt = 0;
                    ans.append('-');
                }
        }
        ans.reverse();
        if(ans.length() > 0 && ans.charAt(0)=='-') ans.deleteCharAt(0);
        return ans.toString();
        
    }
}
