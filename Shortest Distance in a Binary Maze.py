from typing import List
import collections
class Solution:
    
    def shortestPath(self, grid: List[List[int]], source: List[int], destination: List[int]) -> int:
        if source == destination: return 0
        N = len(grid)
        M = len(grid[0])
        if not grid: return 0
        r1 = source[0]
        r2 = source[1]
        if grid[r1][r2] == 0: return -1
        
        q = collections.deque()
        q.append((1, (r1, r2)))
        grid[r1][r2] = 0
        
        dirs = [(1, 0), (0, -1), (-1, 0), (0, 1)]
        while q:
            step, direc = q.popleft()
            r, c = direc
            for i, j in dirs:
                newR, newC = r + i, c + j
                if (newR, newC) == (destination[0], destination[1]): return step
                
                if 0<= newR <N and 0<=newC <M and grid[newR][newC]!=0:
                    q.append((step + 1, (newR, newC)))
                    grid[newR][newC] = 0
        return -1
