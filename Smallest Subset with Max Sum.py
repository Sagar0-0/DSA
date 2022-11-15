class Solution:
    def minSubset(self, A,N):
        A.sort()
        totalSum = sum(A)
        currSum = 0
        for i in range(N-1, -1, -1):
            currSum += A[i]
            totalSum -= A[i]
            if totalSum<currSum:
                return N-i
