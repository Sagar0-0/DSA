class Solution
{
    long ans;
    long dp[][];
    long mod=1000000007;
    long countPS(String str)
    {
        ans=0;
        dp=new long[str.length()][str.length()];
        return dfs(str,0,str.length()-1);
        // Your code here
    }
    long dfs(String s,int i,int j){
        if(i==j){
            return 1;
        }
        if(i+1==j){
            return s.charAt(i)==s.charAt(j)?3:2;
        }
        if(dp[i][j]!=0)return dp[i][j];
        
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]=(1+ dfs(s,i,j-1) + dfs(s,i+1,j))%mod;
        }else{
            dp[i][j]=(dfs(s,i,j-1) + dfs(s,i+1,j))%mod;
            dp[i][j]=(dp[i][j]-dfs(s,i+1,j-1)+mod)%mod;
            return dp[i][j];
        }
    }
    
}
