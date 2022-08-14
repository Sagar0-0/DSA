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
