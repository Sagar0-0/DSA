from collections import defaultdict
class Solution:
    def maxSum (self, w, x, b, n):
        d = defaultdict()
        for i in range(len(x)):
            d[x[i]] = b[i]

        for i in range(len(w)):
            if w[i] not in d:
                d[w[i]] = ord(w[i])

        currSum = 0
        res = float('-inf')
        currStr = ""
        mxStr = ""
        for i in w:
            currSum += d[i]
            currStr += i
            if currSum > res:
                res = currSum
                mxStr = currStr
            if currSum < 0:
                currStr = ""
                currSum = 0
        return mxStr
