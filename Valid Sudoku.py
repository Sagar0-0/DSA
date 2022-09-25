"""https://leetcode.com/problems/valid-sudoku/"""
class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        cols = collections.defaultdict(set)
        rows = collections.defaultdict(set)
        squares = collections.defaultdict(set) 

        for i in range(9):
            for c in range(9):
                if board[i][c] == ".":
                    continue
                if (
                    board[i][c] in rows[i]
                    or board[i][c] in cols[c]
                    or board[i][c] in squares[(i // 3, c // 3)]
                ):
                    return False
                cols[c].add(board[i][c])
                rows[i].add(board[i][c])
                squares[(i // 3, c // 3)].add(board[i][c])

        return True
                
# SUBMISSION REPORT:-
    # Runtime: 95 ms, faster than 97.25% of Python3 online submissions for Valid Sudoku.
    # Memory Usage: 13.9 MB, less than 34.89% of Python3 online submissions for Valid Sudoku.
#EXPLANATION:-
    # We will take three hash sets, one for column, one for rows and one for squre(grid)
    # We will iterate through the rows and columns
    # If the element is a "." (meaning a gap which is yet to be fulfilled) we will skip
    # If it is a number then we will check whether the same number is preesent in either of our hash sets, if it is, we will return false then and there only.
    # Lastly, we will add the element to all of our hashsets
