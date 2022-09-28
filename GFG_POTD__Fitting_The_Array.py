#User function Template for python3

class Solution:
    def isFit (self,arr, brr, n) : 
        #Complete the function
        arr.sort()
        brr.sort()
        for i in  range(n):
            if arr[i]>brr[i]:
                return False;
        return True;
        
#{ 
 # Driver Code Starts
#Initial Template for Python 3


for _ in range(0,int(input())):
    n = int(input())
    arr = list(map(int, input().strip().split()))
    brr = list(map(int, input().strip().split()))
    a=Solution()
    ans = a.isFit(arr, brr, n)
    if(ans == True):
        print("YES")
    else:
        print("NO")
# } Driver Code Ends
