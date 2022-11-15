#User function Template for python3

class Solution:
    def countMin(self, Str):
        arr = Str
        brr = arr[::-1]
        
        m = len(arr)
        n = len(brr)
        lcs = [[0]*(n+1) for _ in range(m+1)]
        
        for i in range(1,m+1):
            for j in range(1,n+1):
                if arr[i-1] == brr[j-1]:
                    lcs[i][j] = 1 + lcs[i-1][j-1]
                else:
                    lcs[i][j] = max(lcs[i-1][j], lcs[i][j-1])
        return n - lcs[m][n]

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':

    t = int(input())

    for _ in range(t):
        Str = input()
        

        solObj = Solution()

        print(solObj.countMin(Str))
# } Driver Code Ends
