class Solution {
    int ans;
    public int numDecodings(String s) {
        ans=0;
        int[]dp=new int[s.length()];
        dfs(0,s,dp);
        return ans;
    }
    void dfs(int i,String s,int[]dp){
        if(i>=s.length()){
            ans++;
            return;
        }
        if(s.charAt(i)=='0')return;
        if(dp[i]!=0){
            ans+=dp[i];
            return;
        }
        dfs(i+1,s,dp);
        if(i+1<s.length() && Integer.parseInt((""+s.charAt(i)+s.charAt(i+1)))<=26){
            dfs(i+2,s,dp);
        }
        dp[i]=ans;
    }
}