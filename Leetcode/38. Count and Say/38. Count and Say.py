class Solution:
    def countAndSay(self, n: int) -> str:
        if n == 1: return "1"
        if n == 2: return "11"
        if n == 3: return "21"
        if n == 4: return  "1211"

        currStr = self.countAndSay(n-1) +  "."
        currCount = 1
        finalStr = ""
        for i in range(len(currStr)-1):
            if currStr[i] != currStr[i + 1]:
                finalStr += str(currCount) + str(currStr[i]) 
                currCount = 1
            else:
                currCount += 1
        return finalStr
