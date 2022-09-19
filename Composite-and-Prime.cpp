class Solution 
{
	public:
		int Count(int L, int R)
		{
		    //Sieve of Eratosthenes
		    vector<bool>isPrime(R+1,true);
		    isPrime[0]=isPrime[1]=false;
		    for(int i=2;i<=R;++i)
		        if(isPrime[i] && (long long)i*i<=R)
		            for(int j=i*i;j<=R;j+=i)
		                isPrime[j]=false;
		    //counting
		    int p=0,c=0;
		    //c-->count of composite numbers
		    //p-->count of prime numbers
		    for(int i=L;i<=R;++i)
		    {
		        if(isPrime[i])
		            p++;
		        else
		            if(i!=0 && i!=1)
		                c++;
		    }
		    return c-p;
		    
		}

};
