class Solution
{
    public long countFriendsPairings(int n) 
    { 
       //code here
       if(n<=2)return n;
       long mod=(int)Math.pow(10,9)+7;
       long secPrev=1;
       long prev=2;
       long curr=0;
       for(int i=3;i<=n;i++){
           curr=(prev+(((i-1)%mod)*(secPrev%mod))%mod)%mod;
           secPrev=prev;
           prev=curr;
       }
       return curr;
    }
}    

//DP approach
class Solution
{
    public long countFriendsPairings(int n) 
    { 
       long mod = 1000000007;
       long[] dp = new long[n+1];
       return helper(n,dp,mod);
    }
    long helper(int n,long[] dp,long mod){
        if(n<=2) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n] = (helper(n-1,dp,mod) + ((n-1)*helper(n-2,dp,mod)))%mod;
    }
    
}   
 
