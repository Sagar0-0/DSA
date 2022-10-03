class Solution {
public:
    bool isMatch(string s, string p) {
        if(p.length()>2000) return false;
        int dp[s.length()+1][p.length()+1];
        memset(dp,0,sizeof(dp));
        dp[0][0]=1;
        for(int i=1; i<p.length()+1; i++){
            dp[0][i] = (p[i-1]=='*' && dp[0][i-1]);
        }
        for(int i=1; i<s.length()+1; i++){
            for(int j=1; j<p.length()+1; j++){
                if(p[j-1]=='*'){
                    dp[i][j] = (dp[i][j-1]||dp[i-1][j]);
                }
                else{
                    if(p[j-1]=='?'||s[i-1]==p[j-1]) dp[i][j] = dp[i-1][j-1];
                }
            }
        }
        return dp[s.length()][p.length()];
    }
};
