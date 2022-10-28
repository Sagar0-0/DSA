class Solution
{
    public int NthTerm(int n)
    {
        // code here
        long prev=2L;
        long mod=1000000007;
        for(int i=2;i<=n;i++){
            long curr=(prev%mod * i%mod)+1;
            prev=curr;
        }
        return (int)prev;
   
