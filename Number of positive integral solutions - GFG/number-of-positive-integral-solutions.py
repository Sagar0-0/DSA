#User function Template for python3
from math import factorial as fact
class Solution:

   def posIntSol(self,s):
       #code here
       r=1
       n=""
       for i in range(len(s)):
           if(s[i]=="+"):
               r+=1
           if(s[i]=="="):
               n=s[i+1:]
               break;
       n=int(n)
       
       if(n-1>=r-1):
           return fact(n-1)//(fact(n-r)*fact(r-1))
       else:
           return 0
#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':

    t = int(input())

    for _ in range(t):
        s = input()

        solObj = Solution()

        print(solObj.posIntSol(s))
# } Driver Code Ends