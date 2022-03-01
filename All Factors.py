class Solution:
	# @param A : integer
	# @return a list of integers
	def allFactors(self, A):
        ans=[]
        i=1
        while i<= math.sqrt(A):
            if A%i==0:
                if A//i==i:
                    ans.append(i)
                else:
                    ans.append(i)
                    ans.append(A//i)
            i+=1
        ans.sort()
        return ans
