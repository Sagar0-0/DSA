#User function Template for python3
class Solution:
	def sumOfAll(self, l, r):
	    # counts[i] will have sum of all the prime factors that divide i
	    # We fill it as we fill the sieve
	    counts = [0] * (r+1)
	    def fill_sieve(n):
	        nonlocal counts
            sieve = [i for i in range(n+1)]
            for i in range(2, n):
                if sieve[i] == i:
                    counts[i] = i
                    cur = i * 2
                    while cur <= n:
                        sieve[cur] = i
                        counts[cur] += i
                        cur += i
            return sieve
        
        def prime_factors(n, sieve):
            if sieve[n] == n:
                return n
            return counts[n]
        
        sieve = fill_sieve(r)
        res = 0
        for i in range(l, r+1):
            res += prime_factors(i, sieve)
        return res


#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		l,r = input().split()
		l=int(l)
		r=int(r)
		ob = Solution();
		print(ob.sumOfAll(l,r))

# } Driver Code Ends
