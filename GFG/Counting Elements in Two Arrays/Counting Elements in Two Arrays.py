from bisect import bisect_right
class Solution:
    def countEleLessThanOrEqual(self,arr1,n1,arr2,n2):
        arr2.sort()
        res = []
        
        for num in arr1:
            res.append(bisect_right(arr2,num))
        return res
