#User function Template for python3
class Solution:
    def previousNumber (ob,S):
        i=len(S)-2
        while i>=0 and S[i]<=S[i+1]:
            i-=1
        if i<0:
            return '-1'
        j=len(S)-1
        while j>i and S[i]<=S[j]:
            j-=1
        while j>0 and S[j-1]==S[j]:
            j-=1
        S=list(S)
        S[i],S[j]=S[j],S[i]
        if S[0]=='0':
            return '-1';
        return ''.join(S)
        
        

#{ 
#  Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        
        S=str(input())

        ob = Solution()
        print(ob.previousNumber(S))
# } Driver Code Ends