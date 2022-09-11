class Solution:
        def findOccurrence(self,mat,target):

            cnt = 0
            m, n = len(mat), len(mat[0])
            seen = set()
        
            def dfs(r, c, target):
                nonlocal cnt, m, n
            
                if not target:
                    cnt += 1
                    return 
                if r < 0 or r >= m or c < 0 or c >= n or (r, c) in seen or mat[r][c] != target[0]:
                    return
                seen.add((r, c))
                dfs(r+1, c, target[1:])
                dfs(r-1, c, target[1:])
                dfs(r, c+1, target[1:])
                dfs(r, c-1, target[1:])
                seen.remove((r, c))
            
            for r in range(len(mat)):
                for c in range(len(mat[0])):
                    if mat[r][c] != target[0]:
                        continue
                    dfs(r, c, target)
            return cnt//4
