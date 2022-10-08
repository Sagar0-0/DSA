# Using Boyer-Moore Voting Algorithm
# Returning the element only if the count is more than n/2 or else -1
#
class Solution:
    def majorityElement(self, arr, n):
        #Your code here
        majorityNum = -1
        numCount = 0
        for index in range(n):
            if numCount == 0:
                majorityNum = arr[index]
                numCount += 1
            else:
                if arr[index] == majorityNum:
                    numCount += 1
                else:
                    numCount -= 1
        
        count = 0
        for i in range(n):
            if (arr[i] == majorityNum):
                count += 1

        if (count > n // 2):
            return majorityNum
        else:
            return -1