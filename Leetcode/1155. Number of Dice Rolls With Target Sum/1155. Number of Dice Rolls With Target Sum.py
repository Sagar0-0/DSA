class Solution:
    def numRollsToTarget(self, n: int, k: int, target: int) -> int:
        dicti={}
        m=(10**9)+7
        def rec(i,res):
            if i in dicti:
                if res in dicti[i]:
                    return dicti[i][res]
            if res>=target or res+n-i>target or res+(n-i)*k<target:
                return 0
            if i==n-1 and res+k>=target:
                return 1
            temp=0
            for j in range(1,k+1):
                temp+=rec(i+1,res+j)
            if i not in dicti:
                dicti[i]={}
            dicti[i][res]=temp
            return temp%m
        return rec(0,0)
