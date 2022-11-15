#User function Template for python3

class Solution:
    def nthItem(self, L1, L2, A, B, N):
       s = sorted({i+j for j in B for i in A})
       if N > len(s) : return -1 
       else : return s[N-1]

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        L1, L2 = [int(x) for x in input().split()]
        A = input().split()
        for itr in range(L1):
            A[itr] = int(A[itr])
        B = input().split()
        for it in range(L2):
            B[it] = int(B[it])
        N = int(input())
        
        ob = Solution()
        print(ob.nthItem(L1, L2, A, B, N))
# } Driver Code Ends