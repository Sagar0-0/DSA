class Solution:

    #Function to perform case-specific sorting of strings.
    def caseSort(self,s,n):
        #code here
        up,low=[],[]
        res=[]
        for i in s:
            if i.isupper():
                up.append(i)
            elif i.islower():
                low.append(i)
        up.sort()
        low.sort()
        x,y=0,0
        for i in s:
            if i.isupper():
                res.append(up[x])
                x+=1
            elif i.islower():
                res.append(low[y])
                y+=1
        ans=''.join(res)
        return ans
