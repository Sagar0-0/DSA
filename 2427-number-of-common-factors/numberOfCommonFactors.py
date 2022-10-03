class Solution:
    def commonFactors(self, a: int, b: int) -> int:
        return sum(not(a%i or b%i) for i in range(1,min(a,b)+1))