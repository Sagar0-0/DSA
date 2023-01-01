class Solution
{
    final long mod=1000000007;
    public int  compute_value(int n)
    {
        // code here
        
        long ans=0;
        long n_fact = 1;
        for(int i=1;i<=n;i++)n_fact = (n_fact%mod*i%mod)%mod;//O(n)
        long r_fact=1;
        long n_r_fact=n_fact;
        for(int r=0;r<=n;r++){//O(n)
            long denom = (r_fact%mod * n_r_fact%mod)%mod;
            long nCr = (n_fact%mod * power(denom,mod-2))%mod;//O(log10^9)
            ans= (ans%mod + ((nCr%mod*nCr%mod)%mod)%mod);
            r_fact=(r_fact%mod*(r+1)%mod)%mod;
            if(n!=r)n_r_fact = (n_r_fact%mod * power((n-r),mod-2))%mod;
        }
        return (int)ans;
    }
    long power(long a,long b){
        if(b==0)return 1;
        long half= power(a,b/2);
        long full = (half%mod*half%mod)%mod;
        if(b%2==1)full = (full%mod*a%mod)%mod;
        return full;
    }
}
