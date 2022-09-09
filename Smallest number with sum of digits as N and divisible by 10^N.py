class Solution:
	def digitsNum(self, N):
		# Code here
		ans = ""
		if N == 0:
		    ans += "0"
		    return ans
		
		if (N%9 != 0):
		    ans += chr(N%9 + ord("0"))
		
		for i in range(1, (N//9) + 1):
		    ans += "9"
		
		for i in range(1, N+1):
		    ans += "0"
		
		return ans
