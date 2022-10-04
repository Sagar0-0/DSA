class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        if not grid:
            return 0
        
        maxArea = 0
        
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == 1:
                    maxArea = max(maxArea, self.dfs(grid, i, j))
                    
        return maxArea
    
                    
    def dfs(self, grid, i, j):
        if i<0 or j<0 or i>=len(grid) or j>=len(grid[0]) or grid[i][j] != 1:
            return 0
        
        maxArea = 1
        grid[i][j] = '#'  # this will act as visited set
        maxArea += self.dfs(grid, i+1, j)
        maxArea += self.dfs(grid, i-1, j)
        maxArea += self.dfs(grid, i, j+1)
        maxArea += self.dfs(grid, i, j-1)
        
        return maxArea