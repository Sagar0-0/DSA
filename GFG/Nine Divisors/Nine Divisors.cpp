class Solution{   
public:
    long long int nineDivisors(long long int N){
        //Code Here
        if(N < 36) return 0;
        
        long long size = sqrt(N);
        
        long long count = 0;
        
        vector<long long> sieve(size+1);
        
        for(int i = 1; i <= size; i++)
        {
            sieve[i] = i;
        }
        
        for(long long i = 2; i*i <= size; i++)
        {
            if(sieve[i] != i) continue;
            for(long long j = i*i; j <= size; j+=i)
            {
                if(sieve[j] == j)
                sieve[j] = i;
            }
        }
        
        for(long long i = 2; i <= size; i++)
        {
            long long p = sieve[i];
            
            long long q = sieve[i/p];
            
            if((p!=q && p*q == i && q !=1) || (sieve[i] == i && pow(i,8) <= N))
            {
                count++;
            }
        }
        return count;
    }
};
