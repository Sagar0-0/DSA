class Solution:
    def maximumEvenSplit(self, num: int) -> List[int]:
        if num&1==1:
            return []
        even=2
        a=[]
        while num>0:
            a.append(even)
            num-=even
            even+=2
        if -num in a:
            a.remove(-num)
        return a
            
                    
