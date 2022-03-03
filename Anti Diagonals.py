class Solution:
    def diagonal(self, A):
        output=[]
        outputIndex=0
        # UPPER
        for i in range(0, len(A)):
            x = 0
            y = i
            output.append([])
            for j in range(i+1):
                output[outputIndex].append(A[x][y])
                x += 1
                y -= 1
            outputIndex += 1
        # LOWER
        for i in range(1, len(A)):
            x = i
            y = len(A) - 1
            output.append([])   
            for j in range(len(A)-i):
                output[outputIndex].append(A[x][y])
                x += 1
                y -= 1
            outputIndex += 1
        return output
