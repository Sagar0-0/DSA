class Solution:
    def isValidSudoku(self, board) -> bool:
        seen = sum(([(c, i), (j, c), (i//3, j//3, c)]
                for i in range(9) for j in range(9)
                for c in [board[i][j]] if c != '.'), [])
        return len(seen) == len(set(seen))