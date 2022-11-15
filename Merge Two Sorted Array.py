class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """   
        
        # Replace the n 0's of "nums1" with all n elements of "nums2"
        j = 0
        for i in range(m, m+n):
            nums1[i] = nums2[j] 
            j+=1
        
        # Sort the list "nums1" in ASCENDING order
        for i in range(len(nums1)):
            for j in  range(i+1, len(nums1)):
                if nums1[i] > nums1[j]:
                    nums1[i], nums1[j] = nums1[j], nums1[i]
