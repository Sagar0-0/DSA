import sys
class Solution:
  sys.setrecursionlimit(10**8)
  def countDistinctIslands(self, grid : List[List[int]]) -> int:
        ans = set()
        n=len(grid)
        m=len(grid[0])

        def dfs(r,c,ans):
            if r<0 or c<0 or r>=n or c>=m or grid[r][c]!=1:
                return
            grid[r][c] = 0
            dfs(r, c-1, arr)
            arr.append('R')
            dfs(r, c+1, arr)
            arr.append('D')
            dfs(r+1, c, arr)
            arr.append('U')
            dfs(r-1, c, arr)
            arr.append('L')

        for i in range(n):
            for j in range(m):
                if grid[i][j] == 1:
                    arr = []
                    dfs(i,j,arr)
                    ans.add(tuple(arr))
        return len(ans)
