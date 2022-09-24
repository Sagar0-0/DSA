class Solution:
    def swapBitGame (self,N):
        n = N
        ct = 0
        while n:
            n &= (n-1)
            ct+=1
        return 1 if ct&1 else 2
