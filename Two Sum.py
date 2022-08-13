class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        
        lookup_dict = {}
        
        for position, number in enumerate(nums):
            
            if target - number in lookup_dict:
                return lookup_dict[target-number], position
            
            else:
                lookup_dict[number] = position
