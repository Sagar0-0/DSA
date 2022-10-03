import math
from collections import defaultdict
class Solution:
    def sumOfAll(self, l, r):
        s=0
        arr=[True for _ in range(r+1)]
        d=defaultdict(list)
        for i in range(2,r+1):
            if arr[i]:
                for j in range(2*i,r+1,i):
                    arr[j]=False
                    d[j].append(i)
                    
        for i in range(l,r+1):
            if arr[i]:
                s+=i
            else:
                s+=sum(d[i])
        return s
