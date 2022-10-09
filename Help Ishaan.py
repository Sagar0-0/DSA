class Solution:
    def NthTerm(self, N):
        def checkPrime(n):
            if n<=1: return False
            if n == 2: return True
            for i in range(2, int(n ** .5) + 1):
                if n%i == 0: return False
            return True
        
        i = N
        j = N
        while True:
            if checkPrime(i) or checkPrime(j):
                return abs(N - i)
            i+=1
            j-=1
