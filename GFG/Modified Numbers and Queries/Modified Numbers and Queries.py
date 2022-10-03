class Solution:
	def sumOfAll(self, l, r):
		# code here
        arr=[0]*(r+1)
        arr[1]=1
        
        for i in range(2,r+1):
            if arr[i]!=0:
                continue
        
            for j in range(i,r+1,i):
                if j%i==0:
                    arr[j]+=i
        
        count=0
        
        for i in range(l,r+1):
            count+=arr[i]
        
        return count

#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		l,r = input().split()
		l=int(l)
		r=int(r)
		ob = Solution();
		print(ob.sumOfAll(l,r))

# } Driver Code Ends
