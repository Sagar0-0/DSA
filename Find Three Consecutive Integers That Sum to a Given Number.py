class Solution:
    def sumOfThree(self, num: int) -> List[int]:
        x=num//3
        a=[x-1,x,x+1]
        if 3*x !=num:
            return []
        return a
        
