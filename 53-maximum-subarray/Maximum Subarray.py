class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        
        current = 0
        maxsum = nums[0]
        
        for i in range(len(nums)):
            current += nums[i]
            
            if current>maxsum:
                maxsum = current
            if current < 0:
                current = 0
            
        return maxsum
            
