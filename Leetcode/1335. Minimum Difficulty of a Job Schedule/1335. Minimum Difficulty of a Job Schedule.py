class Solution:
    def minDifficulty(self, A, d):
        n = len(A)
        if n < d: return -1
        dp, dp2 = [float('inf')] * n, [0] * n
        for d in range(d):
            stack = []
            for i in range(d, n):
                dp2[i] = dp[i - 1] + A[i] if i else A[i]
                while stack and A[stack[-1]] <= A[i]:
                    j = stack.pop()
                    dp2[i] = min(dp2[i], dp2[j] - A[j] + A[i])
                if stack:
                    dp2[i] = min(dp2[i], dp2[stack[-1]])
                stack.append(i)
            dp, dp2 = dp2, dp
        return dp[-1]
