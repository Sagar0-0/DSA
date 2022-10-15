class Solution:
    def findSum(self,A,N): 
        #code here
        min = A[0]
        max = A[0]
        for x in range(1,N):
            if(min>A[x]):min=A[x]
            if(max<A[x]):max=A[x]
        return max+min;