def getSum(n):
        sum = 0
        for digit in str(n): 
            sum += int(digit)      
        return sum
    
class Solution:
    def countEven(self, num: int) -> int:
        count=0
        val=2
        while val<=num:
            if getSum(val)%2==0:
                count+=1;
            val+=1
        return count
