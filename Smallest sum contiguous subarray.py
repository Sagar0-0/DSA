def smallestSumSubarray(A):
        currSum, minSum = 0, float('inf')
        for i in A:
            currSum += i
            minSum = min(currSum, minSum)
            if currSum>0: currSum = 0
        return minSum
