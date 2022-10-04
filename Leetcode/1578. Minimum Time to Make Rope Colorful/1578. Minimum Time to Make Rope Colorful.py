class Solution:
    def minCost(self, colors: str, neededTime: List[int]) -> int:
        lenC = len(colors)
        temp = []
        count = 0
        ans = 0
        for x in range(0,lenC):
            if x == lenC-1:
                if colors[x] == colors[x-1]:
                    temp.append(neededTime[x])
                    count+=1
                    temp = sorted(temp)
                    if len(temp) > 1:
                        for i in range(0,count-1):
                            ans+=temp.pop(0)
                        temp = []
                        count = 0
                    else:
                        temp = []
                        count = 0
                        
            elif colors[x] == colors[x+1]:
                temp.append(neededTime[x])
                count += 1
            else:
                temp.append(neededTime[x])
                count+=1
                temp = sorted(temp)
                if len(temp) > 1:
                    for i in range(0,count-1):
                        ans+=temp.pop(0)
                    temp = []
                    count=0
                else:
                    temp = []
                    count=0
        return ans
