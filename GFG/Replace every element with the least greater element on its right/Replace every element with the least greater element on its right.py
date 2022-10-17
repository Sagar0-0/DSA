from typing import List
import bisect
class Solution:
    def findLeastGreater(self, n : int, arr : List[int]) -> List[int]:
        val = [-1]
        temp = [arr[n-1]]
        for i in range(n-2,-1,-1):
            #bisect right as per question insert the elemnt to the right
            k = bisect.bisect_right(temp,arr[i])
            if k>=0 and k<len(temp):
                bisect.insort_left(temp,arr[i])
                val.append(temp[k+1])
            else:
                bisect.insort_left(temp,arr[i])
                val.append(-1)
        return val[::-1]
