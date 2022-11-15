public class Solution {
    public int longestValidParentheses(String s) {
        int ans=0;
        int n=s.length();
        int open=0;
        int close=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==')'){
                close++;
            }else{
                open++;
            }
            if(close>open){
                open=close=0;
            }else if(open==close)
                ans=Math.max(ans,open*2);
        }
        open=close=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==')')
                close++;
            else
                open++;
            
            if(close<open)
                open=close=0;
            else if(open==close)
                ans=Math.max(ans,open*2);
        }
        return ans;
    }
}
