#User function Template for python3

class Solution:
	def Count(self, l, r):
		size = r
        sieve = [i for i in range(size+1)]
        for i in range(2, size+1):
            if sieve[i] == i:
                j = i * 2
                while j < size+1:
                    sieve[j] = i
                    j += i
        
        comps = primes = 0
        for i in range(max(l, 2), r+1):
            if sieve[i] == i:
                primes += 1
            else:
                comps += 1
        return comps - primes


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		L, R = input().split()
		L = int(L); R = int(R)
		ob = Solution()
		ans = ob.Count(L, R)
		print(ans)

# } Driver Code Ends
