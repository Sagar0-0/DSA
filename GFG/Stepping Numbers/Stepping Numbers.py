class Solution:
    def steppingNumbers(self, n, m):
        visited = set()
        def rec(val):
            if val > m: return
            if n<=val<=m: visited.add(val)
            lastElement = val%10
            num1 = val*10 + lastElement + 1
            num2 = val*10 + lastElement - 1
            if num1 not in visited and lastElement != 9:
                rec(num1)
            if num2 not in visited and lastElement != 0:
                rec(num2)
            return visited
        
        for i in range(10):
            rec(i)
        return len(visited)
