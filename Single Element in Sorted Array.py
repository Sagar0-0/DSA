"""LEETCODE"""

#QUESTION LINK:-https://leetcode.com/problems/single-element-in-a-sorted-array/

#SOLUTION:-
class Solution(object):
    def singleNonDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        l,r=0,len(nums)-1
        if r==0:
            return nums[-1]
        while l<=r:
            mid=(l+r)//2
            if (mid==0 and nums[mid]!=nums[mid+1]) or (mid==r and nums[mid]!=nums[mid-1]) or nums[mid]!=nums[mid-1] and nums[mid]!=nums[mid+1]:
                return nums[mid]
            elif (mid%2==0 and nums[mid]==nums[mid-1]) or (mid%2!=0 and nums[mid]==nums[mid+1]):
                r=mid-1
            else:
                l=mid+1
        return -1
            
#EXPLANATION:-
    #This question is tricky. From examples we can observe that among the repeated elements, the first occur at even index and second at odd index (until the single element is found.) We will use that trick.
    #We will initialize a left and right (l and r) variable as 0 and len(nums)-1. 
    #If r==0(only one element of the array), we will return the only element of the array.
    #After that we will start a while loop till l is less than r, and we will initialize a mid variable as l+r//2. 
    # Now here the tricky part comes, as first condition, we will check if the mid is at index 0 and it is not equal to next index element, OR if mid is the last index and mid is not equal to the previous index element OR if the element is neither equal to the previous nor to the next element, if it fulfills any condition, we will return the mid index.
    # If the first condition is not fulfilled, we will check if the mid is at even index and the element before the mid is equal to current element OR if the index is odd and the next element is equal to to the current element, we will increment the r index.
    #If none of the conditions meet, we will increment the l index.
    #If none element found in loop, we will return -1 as element not found.

#SUBMISSION REPORT:-
    # Runtime: 147 ms, faster than 92.46% of Python online submissions for Single Element in a Sorted Array.
    # Memory Usage: 20.6 MB, less than 20.29% of Python online submissions for Single Element in a Sorted Array.
