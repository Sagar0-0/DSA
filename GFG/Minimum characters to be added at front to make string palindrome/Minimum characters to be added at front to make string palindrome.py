class Solution:
    def minChar(self,str):
        n = len(str)
        i = 0
        j = n-1
        ans=n-1
        while (i<j):
            if str[i]==str[j]:
                i+=1
                j-=1
            else:
                i=0
                ans-=1
                j=ans
        return n-ans-1
#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=="__main__":
    for _ in range(int(input())):
        s=input()
        obj=Solution()
        ans=obj.minChar(s)
        print(ans)
# } Driver Code Ends
