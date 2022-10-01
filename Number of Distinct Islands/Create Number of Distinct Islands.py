#User function Template for python3

import sys
from typing import List
sys.setrecursionlimit(10**8)


class Solution:
    """ 
    Basic Idea: We keep a set and push tuple of tuples in it. These tuples have relative
    coordinates in form (row_no, column_no). We iterate through the grid, if we
    find an unvisited coordinate, whose value is one, we assign relative coordinate (0, 0)
    to it and run dfs on it, we go in all four directions from it and keep changing relative
    coordinate according to where we are going. Once DFS is over we add all the coordinates
    in a tuple and that tuple in the resultant set. We finally return the length of the set.
    """
    def countDistinctIslands(self, grid : List[List[int]]) -> int:
        # Resultant set, whose length we will return
        res = set()
        cur_shape = []
        n, m = len(grid), len(grid[0])
        
        # Checker function, so we do not go outside the grid
        check = lambda x, y: 0 <= x < n and 0 <= y < m
        
        # DFS function
        def recur(x, y, rel_x, rel_y, visited):
            nonlocal cur_shape
            if not check(x, y):
                return
            if visited[x][y] or grid[x][y] == 0:
                return
            cur_shape.append((rel_x, rel_y))
            visited[x][y] = True
            
            recur(x+1, y, rel_x+1, rel_y, visited)
            recur(x-1, y, rel_x-1, rel_y, visited)
            recur(x, y+1, rel_x, rel_y+1, visited)
            recur(x, y-1, rel_x, rel_y-1, visited)
        
        visited = [[False] * m for _ in range(n)]
        
        # Iterating through the grid
        for i in range(n):
            for j in range(m):
               if not visited[i][j] and grid[i][j] == 1:
                   recur(i, j, 0, 0, visited)
                   res.add(tuple(cur_shape))
                   cur_shape = []
        
        return len(res)
        


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=="__main__":
    for _ in range(int(input())):
        n,m=map(int,input().strip().split())
        grid=[]
        for i in range(n):
            grid.append([int(i) for i in input().strip().split()])
        obj=Solution()
        print(obj.countDistinctIslands(grid))
# } Driver Code Ends
