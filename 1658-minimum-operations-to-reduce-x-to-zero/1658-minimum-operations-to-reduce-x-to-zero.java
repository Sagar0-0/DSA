class Solution {
    public int minOperations(int[] nums, int x) {
        
        int k = 0;
		for(int i = 0; i < nums.length; ++i)k  += nums[i];
		k -= x;
		
		int globalMax = -1;
		int windowSum = 0;
		int left = 0;

		for (int i = 0; i < nums.length; i++) {
			windowSum += nums[i];
			while (left <= i && windowSum > k) {
				windowSum -= nums[left];
				++left;
			}
            if(windowSum == k)globalMax = Math.max(globalMax, i - left + 1);
		}
		return globalMax==-1?-1:nums.length - globalMax;
    }
}