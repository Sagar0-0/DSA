from itertools import accumulate
class Solution:
	def solveQueries(self, n, Queries):
		temp = [[0] * n for _ in range(n)]
	
		for a, b, c, d in Queries:
		    for i in range(a, c + 1):
		        temp[i][b] += 1
		        
    		    if d < n - 1:
    		        temp[i][d + 1] -= 1
    		        
    	for i in range(n):
    	    temp[i] = list(accumulate(temp[i]))
		        
		return temp
