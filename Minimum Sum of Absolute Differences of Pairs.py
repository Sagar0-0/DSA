class Solution:
    def findMinSum(self, A,B,N):
        s = zip(sorted(A), sorted(B))
        ans = 0
        for i, j in s: ans += abs(i - j)
        return ans
