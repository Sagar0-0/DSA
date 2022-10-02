class Solution:
    def numberOfSubsequences (ob,N,A):
        import math
        A2 = []
        for i in A:
            if math.ceil((math.log(i, 2) )) ==  math.floor((math.log(i, 2))):
                A2.append(i)
        n = len(A2)
        return (2**n - 1) % (10**9+7)
