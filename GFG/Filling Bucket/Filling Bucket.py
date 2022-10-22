class Solution:
    def fillingBucket(self, N):
        MOD = 10**8     # Storing the value of MOD
        fib = [0]*(N+1)
        
        fib[0] = fib[1] = 1     # First two terms of the series are 1.
        for i in range(2,N+1):
            fib[i] = (fib[i-1]+fib[i-2]) % MOD
            
        return fib[N]
