#User function Template for python3

class Solution:
    def minRepeats(self, A, B):
        parent=str(A)
        ans=1
        while(len(parent)<len(B)):
            parent=parent+str(A)+''
            ans+=1
        if (parent.find(B) == -1):
            parent=parent+str(A)+''
            ans+=1
            if (parent.find(B) == -1):
                return -1
        return ans

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        A=input()
        B=input()
        
        ob = Solution()
        print(ob.minRepeats(A,B))
# } Driver Code Ends