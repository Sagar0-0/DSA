from typing import List
class Solution:
    def minimumCostOfBreaking(self, X, Y, M, N):
        X.sort()
        Y.sort()
        xCut = 1
        yCut = 1
        currPrice = 0
        i = len(X)-1
        j = len(Y)-1
        while i>=0 and j>=0:
            if X[i] > Y[j]:
                currPrice += X[i]*xCut
                yCut +=1
                i-=1
            elif X[i] < Y[j]:
                currPrice += Y[j]*yCut
                xCut +=1
                j -= 1
            elif X[i] == Y[j]:
                if xCut > yCut:
                    currPrice += X[i]*xCut
                    yCut +=1
                    i-=1
                else:
                    currPrice += Y[j]*yCut
                    xCut +=1
                    j-=1
                    
        while i>=0:
            currPrice += X[i]*xCut
            yCut +=1
            i-=1
        while j>=0:
            currPrice += Y[j]*yCut
            xCut +=1
            j-=1
            
        return currPrice
