#User function Template for python3

from functools import lru_cache
class Solution:
    def isKPartitionPossible(self, nums, k):
        #code here
        if sum(nums)%k:
            return False
        visited=[False]*len(nums)
        nums.sort(reverse=True)
        
        target=sum(nums)/k
        
        @lru_cache(None)
        def solve(i,k,ans):
            if k==0:
                return True
            if ans==target:
                return solve(0,k-1,0)
            for j in range(i,len(nums)):
                if visited[j] or ans+nums[j]>target:
                    continue
                visited[j]=True
                if solve(j+1,k,ans+nums[j]):
                    return True
                visited[j]=False
            return False
        return solve(0,k,0)
        
#{ 
#  Driver Code Starts


if __name__ == '__main__':
    tcs = int(input())
    for _ in range(tcs):
        N=int(input())
        arr=[int(x) for x in input().split()]
        k=int(input())
        if Solution().isKPartitionPossible(arr, k):
            print(1)
        else:
            print(0)
# } Driver Code Ends