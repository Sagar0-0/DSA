import numpy as np
class Solution:
	def solveQueries(self, n, Queries):
        mat = np.array([[0 for _ in range(n)] for __ in range(n)])
        for a, b, c, d in Queries:
            mat[a:c+1, b:d+1] += 1
        return mat   
