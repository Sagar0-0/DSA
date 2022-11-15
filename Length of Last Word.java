public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String s) {
        int ans=0;
        boolean started=false;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(started){
                    return ans;
                }
            }else{
                started=true;
                ans++;
            }
        }
        return ans;
    }
}
