#User function Template for python3
class Solution:
	def reverseSpiral(self, R, C, matrix):
	    row =  0
        col = 0
        n = len(matrix)
        m = len(matrix[0])
        endRow = n
        endCol = m
        startRow = -1
        startCol = -1
        arr = []
        while len(arr) < n*m:
            while col < endCol:
                arr.append(matrix[row][col])
                col+=1
            startRow+=1
            row+=1
            col -= 1
            while row < endRow:
                arr.append(matrix[row][col])
                row += 1
            endCol -= 1
            row-=1
            col-=1

            while col > startCol:
                arr.append(matrix[row][col])
                col-=1

            startCol += 1
            col+=1
            row-=1
            while row > startRow:
                arr.append(matrix[row][col])
                row -=1
            endRow -= 1
            row += 1
            col+=1
        return arr[:n*m][::-1]
