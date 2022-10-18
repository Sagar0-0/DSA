class Solution:
    def maximizeSum (self,arr, n) :
        d = dict()
        for i in arr:
            d[i] = d.get(i, 0) + 1
        ans = 0
        for i in range(n - 1, -1, -1):
            if d[arr[i]] <= 0: continue
                
            if arr[i] - 1 in d and d[arr[i] - 1] > 0:
                ans += arr[i]
                d[arr[i] - 1] -= 1
                d[arr[i]] -= 1
                
        for i in d:
            ans += d[i] * i
        return ans
