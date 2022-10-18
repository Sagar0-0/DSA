class Solution:
    def largestPerimeter(self, nums: List[int]) -> int:
        nums.sort(reverse = True)
        i = float('inf')
        j = float("inf")
        k = float('inf')
        nums.append(0)
        for num in nums:
            if i + j > k and j + k > i and i + k > j: return i + j + k
            elif j + k <= i: i = num
            elif k + i <= j: j = num
            elif i + j <= k: k = num
        return 0
