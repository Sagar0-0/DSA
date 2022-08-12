class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        curr = 0
        maxsum = nums[0]
        
        for i in range(len(nums)):
            curr += nums[i]
            
            if curr > maxsum:
                maxsum = curr
            if curr < 0:
                curr = 0
                
        return maxsum
