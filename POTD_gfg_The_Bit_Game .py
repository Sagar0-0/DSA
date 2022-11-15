#User function Template for python3

class Solution:
    def swapBitGame (self,N):
        # code here 
        lis=list(bin(N).replace("0b","") # this will convert the given (N) number to binary Number 
        if (lis.count('1')%2!=0) :
            return(1)
        else:
            return (2)
            


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        
        N=int(input())
        

        ob = Solution()
        print(ob.swapBitGame(N))
# } Driver Code Ends
